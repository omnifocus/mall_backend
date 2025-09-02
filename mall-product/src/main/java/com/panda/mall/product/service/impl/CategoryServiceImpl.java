package com.panda.mall.product.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.panda.mall.commons.PageUtils;
import com.panda.mall.commons.Query;
import com.panda.mall.product.controller.SkuImagesController;
import com.panda.mall.product.dao.CategoryDao;
import com.panda.mall.product.entity.CategoryEntity;
import com.panda.mall.product.service.CategoryService;

@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

	private final SkuImagesController skuImagesController;

	CategoryServiceImpl(SkuImagesController skuImagesController) {
		this.skuImagesController = skuImagesController;
	}

	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		IPage<CategoryEntity> page = this.page(new Query<CategoryEntity>().getPage(params),
				new QueryWrapper<CategoryEntity>());

		return new PageUtils(page);
	}

	@Override
	public List<CategoryEntity> queryPageTree() {
		List<CategoryEntity> list = baseMapper.selectList(null);
		List<CategoryEntity> listWithTree = list.stream().filter(entity -> {
			return entity.getParentCid() == 0;
		}).map((CategoryEntity entity) -> {
			entity.setSubList(findSubList(entity, list));
			return entity;
		}).sorted((entity1, entity2) -> {
			return (entity1.getSort() == null ? 0 : entity1.getSort())
					- (entity2.getSort() == null ? 0 : entity2.getSort());
		}).toList();

		return listWithTree;
	}

	private List<CategoryEntity> findSubList(CategoryEntity entity, List<CategoryEntity> all) {
		return all.stream().filter(e -> {
			return e.getParentCid().equals(entity.getCatId());
		}).map(e -> {
			e.setSubList(findSubList(e, all));
			return e;
		}).sorted((e1, e2) -> {
			return (e1.getSort() == null ? 0 : e1.getSort()) - (e2.getSort() == null ? 0 : e2.getSort());
		}).toList();
	}

	@Override
	public void removeCateogryByIds(List<Long> asList) {
		// TODO 先判断是否有业务关联
		baseMapper.deleteBatchIds(asList);
	}

}

package com.dcn.sell.service.impl;


import com.dcn.sell.domain.ProductCategory;
import com.dcn.sell.repository.ProductCategoryRepository;
import com.dcn.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description 商品类目服务接口实现类
 * @Author dengchangneng
 * @Create 2018年8月14日17:36:20
 **/
@Service
public class CategoryServiceImpl implements CategoryService {

    /**
     * 商品类目DAO
     */
    @Autowired
    private ProductCategoryRepository repository;

    /**
     * @Describe 通过类目ID查询商品类目信息
     * @param categoryId
     * @return
     */
    @Override
    public ProductCategory findOne(Integer categoryId) {
        return repository.findById(categoryId).get();
    }

    /**
     * @Describe 查询所有的类目信息
     * @return
     */
    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    /**
     * @Describe 根据分类类型集合查询类目信息
     * @param categoryTypeList 分类类型集合
     * @return
     */
    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    /**
     * @Describe 保存类目信息
     * @param productCategory
     * @return
     */
    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}

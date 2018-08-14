package com.dcn.sell.service;


import com.dcn.sell.domain.ProductCategory;

import java.util.List;

/**
 * @Description 类目服务接口
 * @Author dengchangneng
 * @Create 2018年8月14日18:04:18
 **/
public interface CategoryService {

    /**
     * @Describe 通过类目ID查询商品类目信息
     * @param categoryId
     * @return
     */
    ProductCategory findOne(Integer categoryId);

    /**
     * @Describe 查询所有的类目信息
     * @return
     */
    List<ProductCategory> findAll();

    /**
     * @Describe 通过类目类型集合查询类目信息
     * @param categoryTypeList 类目类型集合
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    /**
     * @Describe 保存商品类目
     * @param productCategory 商品类目
     * @return
     */
    ProductCategory save(ProductCategory productCategory);
}

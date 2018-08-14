package com.dcn.sell.repository;

import com.dcn.sell.domain.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Description 商品分类DAO类
 * @Author dengchangneng
 * @Create 2018年8月14日17:28:43
 **/
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}

package com.dcn.sell.repository;

import com.dcn.sell.domain.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Description 商品信息DAO类
 * @Author dengchangneng
 * @Create 2018年8月14日17:29:07
 **/
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);
}

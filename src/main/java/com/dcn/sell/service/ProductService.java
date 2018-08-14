package com.dcn.sell.service;

import com.dcn.sell.domain.ProductInfo;
import com.dcn.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Description 商品服务接口实现类
 * @Author dengchangneng
 * @Create 2018年8月14日18:12:48
 **/
public interface ProductService {

    /**
     * @Describe 根据商品id查询商品信息
     * @param productId
     * @return
     */
    ProductInfo findOne(String productId);

    /**
     * @Describe 查询在架商品信息
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * @Describe 分页查询商品信息
     * @param pageable
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

    /**
     * @Describe 保存商品信息
     * @param productInfo
     * @return
     */
    ProductInfo save(ProductInfo productInfo);

    /**
     * @Describe 加库存
     * @param cartDTOList 购物车集合
     */
    void increaseStock(List<CartDTO> cartDTOList);

    /**
     * @Describe 减库存
     * @param cartDTOList 购物车集合
     */
    void decreaseStock(List<CartDTO> cartDTOList);

    //上架

    /**
     * @Describe 上架商品
     * @param productId 商品id
     * @return
     */
    ProductInfo onSale(String productId);

    /**
     * @Describe 下架商品
     * @param productId 商品id
     * @return
     */
    ProductInfo offSale(String productId);
}

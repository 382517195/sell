package com.dcn.sell.dto;

import lombok.Data;

/**
 * @Description 购物车
 * @Author dengchangneng
 * @Create 2018年8月14日16:52:00
 **/
@Data
public class CartDTO {

    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}

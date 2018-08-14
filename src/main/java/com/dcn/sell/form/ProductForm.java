package com.dcn.sell.form;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description 商品form
 * @Author dengchangneng
 * @Create 2018年8月14日17:27:13
 **/
@Data
public class ProductForm {


    private String productId;

    /** 名字. */
    private String productName;

    /** 单价. */
    private BigDecimal productPrice;

    /** 库存. */
    private Integer productStock;

    /** 描述. */
    private String productDescription;

    /** 小图. */
    private String productIcon;

    /** 类目编号. */
    private Integer categoryType;
}

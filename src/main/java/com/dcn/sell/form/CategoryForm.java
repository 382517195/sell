package com.dcn.sell.form;

import lombok.Data;

/**
 * @Description 商品分类form
 * @Author dengchangneng
 * @Create 2018年8月14日17:26:34
 **/
@Data
public class CategoryForm {

    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;
}

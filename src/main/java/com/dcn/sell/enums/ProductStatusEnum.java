package com.dcn.sell.enums;

import lombok.Getter;

/**
 * @Description 商品状态枚举类
 * @Author dengchangneng
 * @Create 2018年8月14日17:24:02
 **/
@Getter
public enum ProductStatusEnum implements CodeEnum {
    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}

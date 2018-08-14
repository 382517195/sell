package com.dcn.sell.enums;

import lombok.Getter;

/**
 * @Description 支付状态枚举类
 * @Author dengchangneng
 * @Create 2018年8月14日17:23:34
 **/
@Getter
public enum PayStatusEnum implements CodeEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),

    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

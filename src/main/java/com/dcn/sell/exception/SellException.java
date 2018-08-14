package com.dcn.sell.exception;


import com.dcn.sell.enums.ResultEnum;

/**
 * @Description 销售异常类
 * @Author dengchangneng
 * @Create 2018年8月14日17:26:04
 **/
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}

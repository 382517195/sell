package com.dcn.sell.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Description 卖家信息
 * @Author dengchangneng
 * @Create 2018年8月14日16:51:15
 **/
@Data
@Entity
public class SellerInfo {

    @Id
    private String sellerId;

    private String username;

    private String password;

    private String openid;
}

package com.dcn.sell.repository;

import com.dcn.sell.domain.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description 卖家信息DAO类
 * @Author dengchangneng
 * @Create 2018年8月14日17:29:38
 **/
public interface SellerInfoRepository extends JpaRepository<SellerInfo, String> {
    SellerInfo findByOpenid(String openid);
}

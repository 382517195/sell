package com.dcn.sell.service;


import com.dcn.sell.dto.OrderDTO;

/**
 * @Description 卖家服务接口
 * @Author dengchangneng
 * @Create 2018年8月14日18:01:55
 **/
public interface BuyerService {
    /**
     * @Describe 通过订单编号和用户的微信openid查询订单
     * @param openid 微信openid
     * @param orderId 订单id
     * @return
     */
    OrderDTO findOrderOne(String openid, String orderId);

    /**
     * @Describe 取消订单
     * @param openid 微信openid
     * @param orderId 订单id
     * @return
     */
    OrderDTO cancelOrder(String openid, String orderId);
}

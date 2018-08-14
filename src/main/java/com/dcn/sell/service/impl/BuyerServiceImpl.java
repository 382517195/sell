package com.dcn.sell.service.impl;


import com.dcn.sell.dto.OrderDTO;
import com.dcn.sell.enums.ResultEnum;
import com.dcn.sell.exception.SellException;
import com.dcn.sell.service.BuyerService;
import com.dcn.sell.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description 买家服务接口实现类
 * @Author dengchangneng
 * @Create 2018年8月14日17:30:15
 **/
@Service
@Slf4j
public class BuyerServiceImpl implements BuyerService {

    /**
     * 订单服务接口
     */
    @Autowired
    private OrderService orderService;

    /**
     * @Describe 通过订单编号和用户的微信openid查询订单
     * @param openid 微信openid
     * @param orderId 订单id
     * @return
     */
    @Override
    public OrderDTO findOrderOne(String openid, String orderId) {
        return checkOrderOwner(openid, orderId);
    }

    /**
     * @Describe 取消订单
     * @param openid 微信openid
     * @param orderId 订单id
     * @return
     */
    @Override
    public OrderDTO cancelOrder(String openid, String orderId) {
        OrderDTO orderDTO = checkOrderOwner(openid, orderId);
        if (orderDTO == null) {
            log.error("【取消订单】查不到改订单, orderId={}", orderId);
            throw new SellException(ResultEnum.ORDER_NOT_EXIST);
        }

        return orderService.cancel(orderDTO);
    }

    /**
     * @Describe 检查订单所有者
     * @param openid 微信的openid
     * @param orderId 订单id
     * @return
     */
    private OrderDTO checkOrderOwner(String openid, String orderId) {
        OrderDTO orderDTO = orderService.findOne(orderId);
        if (orderDTO == null) {
            return null;
        }
        //判断是否是自己的订单
        if (!orderDTO.getBuyerOpenid().equalsIgnoreCase(openid)) {
            log.error("【查询订单】订单的openid不一致. openid={}, orderDTO={}", openid, orderDTO);
            throw new SellException(ResultEnum.ORDER_OWNER_ERROR);
        }
        return orderDTO;
    }
}

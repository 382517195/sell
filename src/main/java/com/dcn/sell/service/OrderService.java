package com.dcn.sell.service;

import com.dcn.sell.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @Description 订单服务接口实现类
 * @Author dengchangneng
 * @Create 2018年8月14日17:30:15
 **/
public interface OrderService {


    /**
     * @Describe 创建订单
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);

    /**
     * @Describe 根据订单id查询单个订单
     * @param orderId 订单id
     * @return
     */
    OrderDTO findOne(String orderId);

    /**
     * @Describe 根据买家openid分页查询订单列表
     * @param buyerOpenid 买家openid
     * @param pageable 分页
     * @return
     */
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);

    /**
     * @Describe 取消订单
     * @param orderDTO 订单
     * @return
     */
    OrderDTO cancel(OrderDTO orderDTO);

    /**
     * @Describe 完结订单
     * @param orderDTO
     * @return
     */
    OrderDTO finish(OrderDTO orderDTO);

    /**
     * @Describe 支付订单
     * @param orderDTO 订单
     * @return
     */
    OrderDTO paid(OrderDTO orderDTO);

    /**
     * @Describe 分页查询订单列表
     * @param pageable 分页对象
     * @return
     */
    Page<OrderDTO> findList(Pageable pageable);

}

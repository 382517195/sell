package com.dcn.sell.repository;

import com.dcn.sell.domain.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Description 订单详情DAO类
 * @Author dengchangneng
 * @Create 2018年8月14日17:27:41
 **/
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

    List<OrderDetail> findByOrderId(String orderId);
}

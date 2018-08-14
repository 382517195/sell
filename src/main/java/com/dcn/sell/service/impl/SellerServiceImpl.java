package com.dcn.sell.service.impl;


import com.dcn.sell.domain.SellerInfo;
import com.dcn.sell.repository.SellerInfoRepository;
import com.dcn.sell.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description 卖家服务接口实现类
 * @Author dengchangneng
 * @Create 2018年8月14日18:00:19
 **/
@Service
public class SellerServiceImpl implements SellerService {

    /**
     * 卖家信息DAO
     */
    @Autowired
    private SellerInfoRepository repository;

    /**
     * @Describe 通过openid查询卖家信息
     * @param openid 微信的openid
     * @return
     */
    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}

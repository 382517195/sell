package com.dcn.sell.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description 微信账号配置类
 * @Author dengchangneng
 * @Create 2018-08-15-10:55
 **/

@Data
@Component
@ConfigurationProperties(prefix = "wechat")
public class WechatAccountConfig {

    private String mpAppId;

    private String mpAppSecret;
}
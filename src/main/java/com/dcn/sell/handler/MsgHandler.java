package com.dcn.sell.handler;


import com.dcn.sell.builder.ImageBuilder;
import com.dcn.sell.builder.TextBuilder;
import com.dcn.sell.utils.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.Map;

import static me.chanjar.weixin.common.api.WxConsts.XmlMsgType;

/**
 * @author Binary Wang(https://github.com/binarywang)
 */
@Component
@Slf4j
public class MsgHandler extends AbstractHandler {

  @Override
  public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage,
                                  Map<String, Object> context, WxMpService weixinService,
                                  WxSessionManager sessionManager) {

    if (!wxMessage.getMsgType().equals(XmlMsgType.EVENT)) {
      //TODO 可以选择将消息保存到本地
    }

    //当用户输入关键词如“你好”，“客服”等，并且有客服在线时，把消息转发给在线客服
    try {
      if (StringUtils.startsWithAny(wxMessage.getContent(), "你好", "客服")
          && weixinService.getKefuService().kfOnlineList()
          .getKfOnlineList().size() > 0) {
        return WxMpXmlOutMessage.TRANSFER_CUSTOMER_SERVICE()
            .fromUser(wxMessage.getToUser())
            .toUser(wxMessage.getFromUser()).build();
      }
    } catch (WxErrorException e) {
      e.printStackTrace();
    }

    //TODO 组装回复消息
    log.info("消息类型为："+wxMessage.getMsgType());
    if("image".equals(wxMessage.getMsgType())){
      return new ImageBuilder().build(wxMessage.getMediaId(),wxMessage,weixinService);
    }
    String content = "收到信息内容：" + JsonUtil.toJsonWeixin(wxMessage);

    return new TextBuilder().build(content, wxMessage, weixinService);

  }

}

package com.yiche;

import com.yiche.pojo.ConsumerMsg;
import com.yiche.utils.XstreamUtil;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * 由于定义了2个队列，所以分别定义不同的监听器监听不同的队列。由于最小消息监听线程数和最大消息监听线程数都是2，所以每个监听器各有2个线程实现监听功能。
 */
@Component
public class MsgRecriver {


    @RabbitListener(queues = "Recommend.UserFollow", containerFactory="rabbitListenerContainerFactory")
    public void onMessage(@Payload Message msg) {
        String messageBody = new String(msg.getBody());
        ConsumerMsg msgObj = (ConsumerMsg) XstreamUtil.parseXmlToObject(messageBody);
        int userId=msgObj.getBody().getOperaterInfo().getUserId();
        int uid=msgObj.getBody().getFriend().getUID();
        String redisKey="yiche.rc.result." +"user"+"."+userId;
       System.out.println(redisKey);
    }

}





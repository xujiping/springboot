package com.study.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 事件监听器
 *
 * @author xujiping 2017-11-01 14:43
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
  @Override
  public void onApplicationEvent(DemoEvent demoEvent) {
    String msg = demoEvent.getMsg();
    System.out.println("我（bean-demoListener）接收到了bean-demoPublisher发布的消息：" + msg);
  }
}

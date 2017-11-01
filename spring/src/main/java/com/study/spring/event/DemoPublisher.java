package com.study.spring.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 事件发布
 *
 * @author xujiping 2017-11-01 14:46
 */
@Component
public class DemoPublisher {

  @Autowired
  ApplicationContext applicationContext;

  public void publish(String msg){
    applicationContext.publishEvent(new DemoEvent(this, msg));
  }

}

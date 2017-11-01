package com.study.spring.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 事件监听
 *
 * @author xujiping 2017-11-01 14:50
 */

public class Main {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new
        AnnotationConfigApplicationContext(EventConfig.class);
    DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
    demoPublisher.publish("hello application event");
    context.close();
  }
}

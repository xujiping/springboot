package com.study.spring.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 异步任务
 *
 * @author xujiping 2017-11-01 15:08
 */

public class Main {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new
        AnnotationConfigApplicationContext(TaskExecutorConfig.class);
    AsyncTaskService service = context.getBean(AsyncTaskService.class);
    for (int i = 0; i < 10; i++) {
      service.executeAsyncTask(i);
      service.executeAsyncTaskPlus(i);
    }
    context.close();
  }
}

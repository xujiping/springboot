package com.study.spring.taskexecutor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * 配置
 *
 * @author xujiping 2017-11-01 15:02
 */
@Configuration
@ComponentScan("com.study.spring.taskexecutor")
@EnableAsync  //开启异步任务支持
public class TaskExecutorConfig implements AsyncConfigurer {

  /**
   * 获取一个基于线程池的TaskExecutor
   * @return
   */
  @Override
  public Executor getAsyncExecutor() {
    ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
    executor.setCorePoolSize(5);
    executor.setMaxPoolSize(10);
    executor.setQueueCapacity(25);
    executor.initialize();
    return executor;
  }

  @Override
  public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
    return null;
  }
}

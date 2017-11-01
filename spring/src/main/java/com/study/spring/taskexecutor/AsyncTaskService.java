package com.study.spring.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 异步任务执行
 *
 * @author xujiping 2017-11-01 15:05
 */
@Service
public class AsyncTaskService {

  /**
   * @Async 表明是异步方法，如果注解在类级别，则表明类中所有方法都是异步方法
   * @param integer
   */
  @Async
  public void executeAsyncTask(Integer integer){
    System.out.println("执行异步任务：" + integer);
  }

  @Async
  public void executeAsyncTaskPlus(Integer integer){
    System.out.println("执行异步任务+1：" + (integer + 1));
  }

}

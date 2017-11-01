package com.study.mvc.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * 替代web.xml
 * 实现此接口将自动被SpringServletContainerInitializer（用来启动servlet 3.0容器）获取到
 * @author xujiping 2017-11-01 16:13
 */

public class WebInitializer implements WebApplicationInitializer {
  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {
    AnnotationConfigWebApplicationContext context = new
        AnnotationConfigWebApplicationContext();
    context.register(MyMvcConfig.class);
    context.setServletContext(servletContext);
    ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new
        DispatcherServlet(context));
    servlet.addMapping("/");
    servlet.setLoadOnStartup(1);
  }
}

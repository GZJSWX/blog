package com.wangxin.blog.config;

import com.wangxin.blog.component.LoginHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcController implements WebMvcConfigurer {

    /**
     * 所有的WebMvcConfigure组件都会一起起作用
     * 这里使用 addViewControllers 注解 页面跳转
     * 当访问网站根目录或"index.html"时，跳转到 login.html 页面 用户后台登录页面
     * localhost:8080 或 localhost:8080/index.html
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry){
//        registry.addViewController("/").setViewName("login");
//        registry.addViewController("/index.html").setViewName("login");
//        registry.addViewController("/main.html").setViewName("main");
    }

    /**
    * 将static下面的js，css文件加载出来
    * @param registry
    */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
}

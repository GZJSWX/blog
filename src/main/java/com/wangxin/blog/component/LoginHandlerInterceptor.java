package com.wangxin.blog.component;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录检测 拦截器
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
   //实现 HandlerInterceptor 接口下的方法 Ctrl + Enter

    // preHandle：目录方法执行之前 拦截器动作
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //获取 session中loginUser的信息
        Object user_info = request.getSession().getAttribute("loginUser");
        if(user_info == null){
            //未登录,转发到根域名（登录页面）,并传去msg错误信息
            request.setAttribute("msg","没有权限请先登录");
            request.getRequestDispatcher("/").forward(request,response);
            return false;
        }else{
            //已登录，放行请求
            return true;
        }

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    // afterCompletino
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}

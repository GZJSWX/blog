package com.wangxin.blog.service;

import com.wangxin.blog.po.User;

public interface UserService {

    User checkUser(String username,String password);
}

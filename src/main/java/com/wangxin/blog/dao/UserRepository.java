package com.wangxin.blog.dao;

import com.wangxin.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    User findByUsernameAndPassword(String username,String password);
}

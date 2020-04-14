package com.wangxin.blog.dao;

import com.wangxin.blog.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<Type,Integer> {

    Type findByName(String name);
}

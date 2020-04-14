package com.wangxin.blog.service;

import com.wangxin.blog.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface TypeService {

    Type saveType(Type type);

    Optional<Type> getType(Integer id);

    Type getTypeByName(String name);

    Page<Type> listType(Pageable pageable);

    Type updateType(Integer id,Type type);

    void deleteType(Integer id);
}

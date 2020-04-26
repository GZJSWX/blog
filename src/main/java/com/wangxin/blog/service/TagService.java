package com.wangxin.blog.service;

import com.wangxin.blog.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface TagService {
    Tag saveTag(Tag tag);

    Optional<Tag> getTag(Integer id);

    Tag getTagByName(String name);

    Page<Tag> listTag(Pageable pageable);

    Tag updateTag(Integer id,Tag tag);

    void deleteTag(Integer id);
}

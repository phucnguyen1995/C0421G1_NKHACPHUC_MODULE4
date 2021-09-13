package com.practice.model.service;

import com.practice.model.Entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {

    //----------------update: bai 12-------------------//
    Page<Blog> findAllPage(Pageable pageable);

    List<Blog> findByContentContaining(String keyword);

}

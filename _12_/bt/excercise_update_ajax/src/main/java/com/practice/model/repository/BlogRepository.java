package com.practice.model.repository;


import com.practice.model.Entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {

    //-----------------update: bai 12-------------------//
    List<Blog> findByContentContaining(String keyword);

}

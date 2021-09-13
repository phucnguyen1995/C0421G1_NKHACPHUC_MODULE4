package com.practice.controller;

import com.practice.model.Entity.Blog;
import com.practice.model.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/blog/api")
@CrossOrigin(origins = "http://localhost:63342")

public class BlogRestController {
    @Autowired
    private IBlogService iBlogService;
    @GetMapping("/find_by_keyword")
    public ResponseEntity<List<Blog>> findByKeyword(@RequestParam String keyword) {
        List<Blog> blogList = iBlogService.findByContentContaining(keyword);
        if (blogList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList,HttpStatus.OK);
    }
    @GetMapping({"/list"})
    public ResponseEntity<Page<Blog>> findAll(@RequestParam int page) {
        Page<Blog> blogList = iBlogService.findAllPage(PageRequest.of(page,2, Sort.by("createDate").descending()));  //PageRequest.of(a,b): a = page thứ..., b= số phần tử của page
        if (blogList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList,HttpStatus.OK);
    }
}

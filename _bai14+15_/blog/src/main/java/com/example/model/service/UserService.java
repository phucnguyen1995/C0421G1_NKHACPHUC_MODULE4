package com.example.model.service;




import com.example.model.bean.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(int id);
}

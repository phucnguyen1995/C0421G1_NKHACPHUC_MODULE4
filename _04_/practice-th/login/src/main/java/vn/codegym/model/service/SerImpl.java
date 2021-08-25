package vn.codegym.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.bean.Login;
import vn.codegym.model.bean.User;
import vn.codegym.model.repository.IRepo;




@Service
public class SerImpl implements ISer{
    @Autowired
    IRepo iRepo;
    @Override
    public User checkLogin(Login login) {
        return this.iRepo.checkLogin(login);
    }


}

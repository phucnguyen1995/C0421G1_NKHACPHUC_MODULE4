package vn.codegym.model.service;

import vn.codegym.model.bean.Login;
import vn.codegym.model.bean.User;

public interface ISer {
    User checkLogin(Login login);
}

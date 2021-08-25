package vn.codegym.model.repository;

import vn.codegym.model.bean.Login;
import vn.codegym.model.bean.User;

public interface IRepo {
   User checkLogin(Login login);
}

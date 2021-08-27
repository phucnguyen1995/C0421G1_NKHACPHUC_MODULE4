package vn.codegym.model.repository;

import vn.codegym.model.bean.PersonalInformation;

import java.util.List;

public interface IRepo {
    PersonalInformation edit(PersonalInformation newPersonInfo);
    List<String> gender();
    List<String> nationality();

}

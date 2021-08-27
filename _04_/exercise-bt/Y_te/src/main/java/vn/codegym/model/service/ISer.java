package vn.codegym.model.service;

import vn.codegym.model.bean.PersonalInformation;

import java.util.List;

public interface ISer {
    PersonalInformation edit(PersonalInformation newPersonInfo);
    List<String> gender();
    List<String> nationality();

}

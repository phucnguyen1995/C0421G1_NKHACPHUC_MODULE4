package vn.codegym.model.repository;

import org.springframework.stereotype.Repository;
import vn.codegym.model.bean.PersonalInformation;

import java.util.ArrayList;
import java.util.List;


@Repository
public class RepoImpl implements IRepo {


    @Override
    public PersonalInformation edit(PersonalInformation newPersonInfo) {
        return newPersonInfo;
    }

    @Override
    public List<String> gender() {
        List<String> genderList = new ArrayList<>();
        genderList.add("Male");
        genderList.add("Female");
        genderList.add("Other");

        return genderList;
    }

    @Override
    public List<String> nationality() {
        List<String> nationList = new ArrayList<>();
        nationList.add("Vietnamese");
        nationList.add("Chinese");
        nationList.add("Cambodia");

        return nationList;
    }
}

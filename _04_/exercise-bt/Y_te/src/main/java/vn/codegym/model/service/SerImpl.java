package vn.codegym.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.bean.PersonalInformation;
import vn.codegym.model.repository.IRepo;

import java.util.List;


@Service
public class SerImpl implements ISer{

    @Autowired
    private IRepo iRepo;

    @Override
    public PersonalInformation edit(PersonalInformation newPersonInfo) {
        return iRepo.edit(newPersonInfo);
    }

    @Override
    public List<String> gender() {
        return iRepo.gender();
    }

    @Override
    public List<String> nationality() {
        return iRepo.nationality();
    }
}

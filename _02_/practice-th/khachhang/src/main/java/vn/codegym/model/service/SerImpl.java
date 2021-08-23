package vn.codegym.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.repository.IRepo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class SerImpl implements ISer{
    @Autowired
    IRepo iRepo;
    @Override
    public boolean validate(String regex) {
//        return this.iRepo.validate(regex);
        String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        Matcher matcher;
        matcher = Pattern.compile(EMAIL_REGEX).matcher(regex);
        return matcher.matches();
    }


}

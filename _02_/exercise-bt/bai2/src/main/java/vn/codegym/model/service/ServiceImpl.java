package vn.codegym.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.repo.IRepository;

@Service
public class ServiceImpl implements IService {
    @Autowired
    IRepository iRepository;

    @Override
    public double result(double a, char operator, double b) {
        return iRepository.result(a,operator,b);
    }
}

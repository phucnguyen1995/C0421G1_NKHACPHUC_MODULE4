package vn.codegym.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.repo.IRepository;

@Service
public class ServiceImpl implements IService {
    @Autowired
    IRepository iRepository;
    @Override
    public double convert(double usa, double rate) {
        return this.iRepository.convert(usa,rate);
    }
}

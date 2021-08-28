package vn.codegym.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.codegym.model.bean.Customer;
import vn.codegym.model.repository.ICustomerRepo;

import java.util.List;


@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    ICustomerRepo customerRepo;

    @Override
    public List<Customer> findAll() {
        return this.customerRepo.findAll();
    }

    @Override
    public void save(Customer customer) {
        this.customerRepo.save(customer);
    }

    @Override
    public Customer findById(int id) {
        return this.customerRepo.findById(id);
    }

    @Override
    public void update(int id, Customer customer) {
        this.customerRepo.update(id, customer);
    }

    @Override
    public void remove(int id) {
        this.customerRepo.remove(id);
    }
}

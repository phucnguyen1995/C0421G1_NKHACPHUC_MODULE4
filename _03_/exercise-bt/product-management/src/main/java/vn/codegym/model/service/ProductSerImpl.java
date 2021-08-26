package vn.codegym.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.bean.Product;
import vn.codegym.model.repository.IProductRepo;

import java.util.List;

@Service
public class ProductSerImpl implements IProductService {

    @Autowired
    IProductRepo iProductRepo;

    @Override
    public List<Product> findAll() {
        return iProductRepo.findAll();
    }

    @Override
    public void save(Product product) {
        iProductRepo.save(product);
    }

    @Override
    public Product findById(int id) {
        return iProductRepo.findById(id);
    }

    @Override
    public void update(int id, Product product) {
        iProductRepo.update(id, product);
    }

    @Override
    public void remove(int id) {
        iProductRepo.remove(id);
    }

    @Override
    public List<Product> finByName(String name) {
        return this.iProductRepo.finByName(name);
    }

//    @Override
//    public List<Product> searchByName(String name) {
//        return iProductRepo.searchByName(name);
//    }
}

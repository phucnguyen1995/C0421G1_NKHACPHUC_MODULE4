package vn.codegym.model.repository;

import org.springframework.stereotype.Repository;
import vn.codegym.model.bean.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepoImpl implements IProductRepo {


//    private int id;
//    private String name;
//    private double price;
//    private String description;
//    private String producer;

//     private static Map<Integer,Product> products=new HashMap<>();
//       Product product=new Product();

    private static Map<Integer,Product> products;
    static {
        products=new HashMap<>();
        products.put(1,new Product(1,"giay",35,"tot","danang"));
        products.put(2,new Product(2,"dep",10,"rat tot","hanoi"));
    }
    
    



    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);

    }

    @Override
    public Product findById(int id) {
      return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);

    }

    @Override
    public void remove(int id) {
        products.remove(id);

    }

//    @Override
//    public List<Product> searchByName(String name) {
//        List<Product> product = new ArrayList<>();
//
//        for (Product p: product) {
//            if (name.equals(p.getName())) {
//                product.add(p);
//            }
//        }
//        return product;
//
//    }


    @Override
    public List<Product> finByName(String name) {
        List<Product> productList = new ArrayList<>(products.values());
        List<Product> products = new ArrayList<>();
        for (Product product : productList) {
            if (name.toLowerCase().contains(product.getName().toLowerCase())) {
                products.add(product);
            }
        }
        return products;
    }


}

package vn.codegym.model.repo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class RepositoryImpl implements IRepository {

    @Override
    public String dictionary(String world) {

        Map<String,String> map =new HashMap<>();
        map.put("love","yêu");
        map.put("fail","thất bại");

        if(map.containsKey(world)) {
            return  map.get(world);
        }
        return "Không tòn tại";
    }
}

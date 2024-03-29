package com.example.secondtask.product.repository;
import org.springframework.stereotype.Repository;
import com.example.secondtask.product.domain.Product;
import java.util.HashMap;
import java.util.Map;
public class ProductRepository {
    protected final Map<Long,Product> map =new HashMap<>();
    protected  long counter =1;
    public Product save(Product entity){
        setId(entity);
        return entity;
    }
    private Product setId(Product entity){
        entity.setId(counter);
        map.put(counter,entity);
        counter++;
        return entity;
    }
}

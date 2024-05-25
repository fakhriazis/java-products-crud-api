package demi.api.demo.models.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import demi.api.demo.models.entities.Product;

public interface ProductRepo extends CrudRepository<Product, Long>{

    List<Product> findByNameContains(String name);
    
    
} 
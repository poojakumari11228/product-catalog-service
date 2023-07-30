package webshop.productcatalog.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import webshop.productcatalog.domain.Product;

@Repository
public interface ProductRepo extends MongoRepository<Product, Long> {
    Product findByProductNumber(Long productNumber);
}

package webshop.productcatalog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webshop.productcatalog.domain.Product;
import webshop.productcatalog.dto.ProductDTO;
import webshop.productcatalog.repository.ProductRepo;

@Service
public class ProductService {


    private final ProductRepo productRepo;
    @Autowired
    ProductService(ProductRepo productRepo){
        this.productRepo = productRepo;
    }

    public void addProduct(ProductDTO productDTO){

        Product product = Product.builder()
                .productNumber(productDTO.getProductNumber())
                .description(productDTO.getDescription())
                .price(productDTO.getPrice())
                .build();

        productRepo.save(product);

    }

    public ProductDTO getProduct(Long productNumber){

        Product product = productRepo.findByProductNumber(productNumber);
        ProductDTO productDTO = ProductDTO.builder()
                .productNumber(product.getProductNumber())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();

        return productDTO;

    }
}

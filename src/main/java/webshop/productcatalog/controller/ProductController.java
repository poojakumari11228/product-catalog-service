package webshop.productcatalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import webshop.productcatalog.dto.ProductDTO;
import webshop.productcatalog.service.ProductService;

@RestController
@RequestMapping("/api/v1/product-catalog")
public class ProductController {


    private final ProductService productService;
    @Autowired
    ProductController(ProductService productService){
        this.productService = productService;
    }
    @PostMapping
    public void addProduct(@RequestBody ProductDTO productDTO){
        productService.addProduct(productDTO);
    }

    @GetMapping("/{id}")
    public ProductDTO getProduct(@PathVariable("id") Long id){
        return productService.getProduct(id);
    }
}

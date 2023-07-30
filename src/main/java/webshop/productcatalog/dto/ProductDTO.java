package webshop.productcatalog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
@AllArgsConstructor
@Getter
public class ProductDTO {
    private Long productNumber;
    private String description;
    private double price;
}

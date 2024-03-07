package com.example.secondtask.product.support;
import org.springframework.stereotype.Component;
import com.example.secondtask.product.api.request.ProductRequest;
import com.example.secondtask.product.api.response.ProductResponse;
import com.example.secondtask.product.domain.Product;
@Component
public class ProductMapper {
public Product toProduct(ProductRequest productRequest){
    return new Product(productRequest.getName());
}
public ProductResponse toProductResponse(Product product){
    return new ProductResponse(product.getId(), product.getName());

}
}

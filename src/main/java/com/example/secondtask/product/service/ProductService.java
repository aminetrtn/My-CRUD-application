package com.example.secondtask.product.service;
import org.springframework.stereotype.Service;
import com.example.secondtask.product.api.request.ProductRequest;
import com.example.secondtask.product.api.response.ProductResponse;
import com.example.secondtask.product.domain.Product;
import com.example.secondtask.product.repository.ProductRepository;
import com.example.secondtask.product.support.ProductMapper;
@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    public ProductService(ProductRepository productRepository,ProductMapper productMapper)
    {
        this.productRepository=productRepository;
        this.productMapper=productMapper;
    }
public ProductResponse create(ProductRequest productRequest)
{
    Product product=productRepository.save(productMapper.toProduct(productRequest));
    return productMapper.toProductResponse(product);
}


}

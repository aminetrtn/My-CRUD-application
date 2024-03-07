package com.example.secondtask.product.api;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.example.secondtask.product.api.request.ProductRequest;
import com.example.secondtask.product.api.response.ProductResponse;
import com.example.secondtask.product.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService)
    {
        this.productService=productService;
    }
    @PostMapping
    public ResponseEntity<ProductResponse>create(@RequestBody ProductRequest productRequest)
    {
        ProductResponse productResponse=productService.create(productRequest);
        return new ResponseEntity<>(productResponse,HttpStatus.CREATED);
    }
}

package glim.antony.controllers;

import glim.antony.dto.ProductDTO;
import glim.antony.entities.Product;
import glim.antony.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest/v1/products")
public class ProductRestController {

    private ProductService productsService;

    @Autowired
    public void setProductsService(ProductService productsService) {
        this.productsService = productsService;
    }

    @GetMapping("/") //http://localhost:9873/rest/v1/products/
    @ResponseStatus(HttpStatus.OK)
    public List<ProductDTO> showProducts(){
        List<ProductDTO> productDTOS = new ArrayList<>();
        for (Product product : productsService.findAll()) {
            productDTOS.add(new ProductDTO(product));
        }
        return productDTOS;
    }

    @GetMapping("/{id}") //http://localhost:9873/rest/v1/products/2
    @ResponseStatus(HttpStatus.OK)
    public Product showProductById(@PathVariable(name = "id") Long id){
        Product product = productsService.findById(id);
        return product;
    }

    @GetMapping("/hello") //http://localhost:9873/rest/v1/products/hello
    @ResponseStatus(HttpStatus.OK)
    public String hello(){
        return "I close my eyes and see your face!";
    }
}

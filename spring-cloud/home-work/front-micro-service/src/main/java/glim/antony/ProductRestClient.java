package glim.antony;

import glim.antony.dto.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("product-micro-service")
public interface ProductRestClient {

    @RequestMapping("/rest/v1/products/")
    List<ProductDTO> showProducts();

    @RequestMapping("/rest/v1/products/{id}")
    String showProductById(@PathVariable(name = "id") Long id);

    @GetMapping("/rest/v1/products/hello")
    String hello();
}

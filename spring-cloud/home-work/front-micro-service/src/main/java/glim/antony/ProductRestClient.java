package glim.antony;

import glim.antony.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

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

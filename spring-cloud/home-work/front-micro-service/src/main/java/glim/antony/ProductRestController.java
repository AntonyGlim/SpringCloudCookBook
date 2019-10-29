package glim.antony;

import glim.antony.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductRestController {

    ProductRestClient productRestClient;

    @Autowired
    public void setProductRestClient(ProductRestClient productRestClient) {
        this.productRestClient = productRestClient;
    }

    @RequestMapping("/get-products")
    public String showProducts(Model model){
        List<ProductDTO> productDTOS = productRestClient.showProducts();
        model.addAttribute("productDTOS", productDTOS);
        return "index";
    }

    @GetMapping("/get-hello")
    public String hello(Model model){
        String answer = productRestClient.hello();
        model.addAttribute("answer", answer);
        return "index";
    }

}

package glim.antony;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class ProductRestController {

    ProductRestClient productRestClient;

    @Autowired
    public void setProductRestClient(ProductRestClient productRestClient) {
        this.productRestClient = productRestClient;
    }

    @RequestMapping("/get-products")
    public String showProducts(Model model){
        String answer = productRestClient.showProducts();
        model.addAttribute("answer", answer);
        return "index";
    }

    @GetMapping("/get-hello")
    public String hello(Model model){
        String answer = productRestClient.hello();
        model.addAttribute("answer", answer);
        return "index";
    }

}

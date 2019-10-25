package glim.antony.services;

import glim.antony.spring_led_market.entities.Product;
import glim.antony.spring_led_market.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductsRepository productsRepository;

    @Autowired
    public void setProductsRepository(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public Page<Product> findAllByPagingAndFiltering(Specification<Product> specification, Pageable pageable) {
        return productsRepository.findAll(specification, pageable);
    }

    public Product save(Product product) {
        return productsRepository.save(product);
    }

    public List<Product> findAll() {
        return (List<Product>)productsRepository.findAll();
    }

    public Product findById(Long id) {
        return productsRepository.findById(id).get();
    }

}

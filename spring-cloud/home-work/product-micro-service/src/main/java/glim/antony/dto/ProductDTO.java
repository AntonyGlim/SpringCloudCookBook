package glim.antony.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
public class ProductDTO implements Serializable {


    private static final long serialVersionUID = -8258608012743322234L;

    private Long id;

    private String title;

    private BigDecimal price;

    private List<ProductImage> images;

    public ProductDTO(Long id, String title, BigDecimal price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }
}

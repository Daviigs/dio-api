package dio_api_rest.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    private String agency;

    @Column( scale = 2, precision = 12)
    private BigDecimal balance;

    @Column(name = "additional_limit ", scale = 2, precision = 13)
    private BigDecimal limit;
}

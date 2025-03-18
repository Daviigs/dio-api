package dio_api_rest.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @OneToOne(cascade = CascadeType.ALL)

    private Account account;
    @OneToOne(cascade = CascadeType.ALL)
    private Card card;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Feature> feature;
    @OneToMany(cascade = CascadeType.ALL)
    private List<News> news;
}

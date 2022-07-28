package school.devskill.fumetteria.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false, length = 20)
    private String name;
    @Column(nullable = false,length = 20)
    private String title;
    @Column(length = 100)
    private String description;
    @Column(length = 100)
    private String dimension;
    @Column
    private String image;
    @Column(nullable = false,length = 20)
    private String category;
    @Column(nullable = false)
    private Integer autor;
    @Column(nullable = false,length = 20)
    private String type;
}

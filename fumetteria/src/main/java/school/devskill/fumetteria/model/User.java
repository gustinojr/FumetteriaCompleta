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
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false, length=20)
    private String name;
    @Column(nullable = false, length=20)
    private String surname;
    @Column(nullable = false, length=20)
    private String username;
    @Column(nullable = false, length=20)
    private String password;
}

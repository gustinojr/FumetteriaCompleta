package school.devskill.fumetteria.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    int id;
    String name;
    String description;
    String title;
    String dimension;
    String image;
    String category;
    int author;
    String type;

}

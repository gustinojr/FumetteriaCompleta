package school.devskill.fumetteria.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductCommand {
    String name;
    String description;
    String title;
    String dimension;
    String image;
    String category;
    int author;
    String type;

}

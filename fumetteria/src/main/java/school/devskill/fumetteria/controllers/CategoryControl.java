package school.devskill.fumetteria.controllers;

import org.springframework.web.bind.annotation.*;
import school.devskill.fumetteria.command.CategoryCommand;
import school.devskill.fumetteria.DTO.CategoryDTO;


@RestController
@RequestMapping
public class CategoryControl {
    @GetMapping("/get")
    public String getCategory(@PathVariable String name){
        return "Get Category";
    }

    @PostMapping("/search")
    public String searchCategory (@RequestBody String name, String description){
        return "Search";
    }
    @PostMapping("/create")
    public CategoryDTO createCategory(@RequestBody CategoryCommand categoryCommand){
        CategoryDTO nuovaCategoria = new CategoryDTO("azione","si stanno picchiando male");
        return nuovaCategoria;
    }



//@DeleteMapping("/delete")
//    return;
//
//
}

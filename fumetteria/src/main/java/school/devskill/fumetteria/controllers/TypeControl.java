package school.devskill.fumetteria.controllers;

import org.springframework.web.bind.annotation.*;
import school.devskill.fumetteria.command.TypeCommand;
import school.devskill.fumetteria.DTO.TypeDTO;


@RestController
@RequestMapping
public class TypeControl {
    @GetMapping("/get")
    public String getType(@PathVariable String name){
        return "Get TYpe";
    }

    @PostMapping("/search")
    public String searchType (@RequestBody String name, String description){
        return "Search";
    }
    @PostMapping("/create")
    public TypeDTO createCategory(@RequestBody TypeCommand typeCommand){
        TypeDTO nuovoTipo = new TypeDTO("fumetto","albo colorato che racconta storie");
        return nuovoTipo;
    }



//@DeleteMapping("/delete")
//    return;
//
//
}
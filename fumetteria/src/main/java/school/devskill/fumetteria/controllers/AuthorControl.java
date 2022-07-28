package school.devskill.fumetteria.controllers;

import org.springframework.web.bind.annotation.*;
import school.devskill.fumetteria.command.AuthorCommand;
import school.devskill.fumetteria.DTO.AuthorDTO;



@RestController
@RequestMapping
public class AuthorControl {
    @GetMapping("/get")
    public String getAuthor(@PathVariable int id) {
        return "get Autore";
    }
    @PostMapping("/search")
    public String searchAuthor (@RequestBody String name, String surname){
        return "Search";
    }
    @PostMapping("/create")
    public AuthorDTO createAuthor(@RequestBody AuthorCommand authorCommand){
        AuthorDTO nuovoAutore = new AuthorDTO(1,"Umberto","Smaila");
        return nuovoAutore;
    }



//@DeleteMapping("/delete")
//    return;
//
//
}

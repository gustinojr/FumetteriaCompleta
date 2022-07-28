package school.devskill.fumetteria.controllers;

import org.springframework.web.bind.annotation.*;
import school.devskill.fumetteria.command.UserCommand;
import school.devskill.fumetteria.DTO.UserDTO;

@RestController
@RequestMapping
public class UserContol {
    @GetMapping("/get")
    public String getUser(@PathVariable int id){
        return "Metodo get user";
    }


    @PostMapping("/search")
        public String searchUser (@RequestBody String name, String surname, String username, String password){
            return "Search";
        }

    @PostMapping("/create")
    public UserDTO createUser(@RequestBody UserCommand userCommand){
            UserDTO nuovoUtente = new UserDTO(100,"Raffaele","D'Agostino","dagostinoraf@gmail.com","ciao");
       return nuovoUtente;
        }



//@DeleteMapping("/delete")
//    return;
//
//


}


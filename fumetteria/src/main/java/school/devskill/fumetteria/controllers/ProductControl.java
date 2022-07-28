package school.devskill.fumetteria.controllers;

import org.springframework.web.bind.annotation.*;
import school.devskill.fumetteria.command.ProductCommand;
import school.devskill.fumetteria.DTO.ProductDTO;

@RestController
@RequestMapping
public class ProductControl {
    @GetMapping("/get")
    public String getProduct(@PathVariable int id) {
        return "get Prodotto";
    }
    @PostMapping("/search")
    public String searchProduct (@RequestBody String name, String description, String title, String dimension, String image, String category, int author, String type){
        return "Search";
    }
    @PostMapping("/create")
    public ProductDTO createProduct(@RequestBody ProductCommand productCommand){
        ProductDTO nuovoProdotto = new ProductDTO(1,"La ciurma salpa","Ragazzi che fanno i pirati","One Piece","0","onePiece.png","Azione",1,"fumetto");
        return nuovoProdotto;
    }



//@DeleteMapping("/delete")
//    return;
//
//
}

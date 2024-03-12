package sam.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import sam.example.demo.Item;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/list")
    @ResponseBody
    public Item[] viewItem() {
        Item[] newArray = new Item[4];
        newArray[0] = new Item(1, "CAR1", "Mazda", "Vehicle", "1");
        newArray[1] = new Item(2, "CAR2", "Tesla", "Vehicle", "4");
        newArray[2] = new Item(3, "CAR3", "Ford", "Vehicle", "7");
        newArray[3] = new Item(4, "CAR4", "Jeep", "Vehicle", "3");

        return newArray;
    }

  /*  @PostMapping("/list/edit")
    public Item[] updateList(@RequestBody Item item) {
        return "Hello, "+studentName;
    }*/
}
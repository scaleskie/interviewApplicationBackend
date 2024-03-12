package sam.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import sam.example.demo.Item;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemController {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @RequestMapping("/list")
    @ResponseBody
    public ArrayList<Item> viewItem(@RequestParam(value = "id", defaultValue = "0") Integer id) {
        ArrayList<Item> itemList = new ArrayList<Item>();
        Item returnedItem = null;

        itemList.add(new Item(1, "White Table", "assets/images/table.jpeg", "This is a table picture."));
        itemList.add(new Item(2, "White Chair", "assets/images/chair.jpeg", "This is a chair"));
        itemList.add(new Item(3, "Yellow Tent", "assets/images/tent.jpeg", ""));
        itemList.add(new Item(4, "White Cup", "assets/images/cup.jpeg", ""));
        itemList.add(new Item(5, "White Small Cup", "assets/images/cup.jpeg", ""));
        itemList.add(new Item(6, "Blue Bowl", "assets/images/bowl.jpeg", ""));
        itemList.add(new Item(7, "Marble Table", "assets/images/table.jpeg", "This is a table picture."));
        itemList.add(new Item(8, "Desk Chair", "assets/images/chair.jpeg", "This is a chair"));
        itemList.add(new Item(9, "Outside Tent", "assets/images/tent.jpeg", ""));
        itemList.add(new Item(10, "Coffee Cup", "assets/images/cup.jpeg", ""));
        itemList.add(new Item(11, "Breakfast Bowl", "assets/images/bowl.jpeg", ""));
        itemList.add(new Item(12, "Kitchen Table", "assets/images/table.jpeg", "This is a table picture."));
        itemList.add(new Item(13, "Office Chair", "assets/images/chair.jpeg", "This is a chair"));
        itemList.add(new Item(14, "Four Person Tent", "assets/images/tent.jpeg", ""));
        itemList.add(new Item(15, "Handled Cup", "assets/images/cup.jpeg", ""));
        itemList.add(new Item(16, "Small Bowl", "assets/images/bowl.jpeg", ""));
        itemList.add(new Item(17, "Large Table", "assets/images/table.jpeg", "This is a table picture."));
        itemList.add(new Item(18, "Single Chair", "assets/images/chair.jpeg", "This is a chair"));
        itemList.add(new Item(19, "Large Tent", "assets/images/tent.jpeg", ""));
        itemList.add(new Item(20, "Medium Cup", "assets/images/cup.jpeg", ""));
        itemList.add(new Item(21, "Single Bowl", "assets/images/bowl.jpeg", ""));
        itemList.add(new Item(22, "Large Blue Bowl", "assets/images/bowl.jpeg", ""));


        for (int i = 0; i < itemList.size(); i++) {
            Item item = itemList.get(i);
            if (item.getId().equals(id)) {
                returnedItem = item;
            }
        }

        return itemList;
    }
}
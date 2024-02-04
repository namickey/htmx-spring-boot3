package com.example.demo.web.menu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Item;

@Controller
public class MenuController {

    @GetMapping("/")
    public String index() {
        return "menu";
    }

    @GetMapping("/itemList")
    public String getItemList(Model model) {
    
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item(1, "リンゴ", 100));
        model.addAttribute("itemList", itemList);
        return "itemList";
    }
}

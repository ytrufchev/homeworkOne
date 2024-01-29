package com.example.homeworkOne;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SneakyController {
    @GetMapping("/sneakyyou")
    public String sneakyyou(Model model){
        model.addAttribute("link", "https://www.youtube.com/watch?v=dQw4w9WgXcQ");
        return "sneakyyou";
    }
}

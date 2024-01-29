package com.example.homeworkOne;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PrintNumbersController {
    @GetMapping("/print-numbersntom")
    public String printNumbers1(@RequestParam String n, @RequestParam String m, Model model){
        if (!isInteger(n) || !isInteger(m)) {
            return "sneakyyou";
        }
        PrintNumbers pn = new PrintNumbers(Integer.parseInt(n), Integer.parseInt(m));
        String numbers = pn.printNumbers();
        String title = "The numbers between " + n + " and " + m + " are:";
        model.addAttribute("title", title);
        model.addAttribute("numbers", numbers);
        model.addAttribute("n", n);
        model.addAttribute("m", m);
        return "print-numbers";
    }
    @GetMapping("/print-numbersoneton")
    public String printNumbers(@RequestParam String n, Model model){
        if (!isInteger(n)) {
            return "sneakyyou";
        }
        PrintNumbers pn = new PrintNumbers(Integer.parseInt(n));
        String numbers = pn.printNumbers();
        String title = "The numbers between 1 and " + n + " are:";
        model.addAttribute("numbers", numbers);
        model.addAttribute("n", n);
        model.addAttribute("title", title);
        return "print-numbers";
    }
    private boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

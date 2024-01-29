package com.example.homeworkOne;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class MessiController {

    private RestTemplate restTemplate;

    public void FootballDataController(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @GetMapping("/messi")
    public String mesi(Model model){
            Messi messi = new Messi();
            model.addAttribute("name", messi.getFullName());
            model.addAttribute("bio", messi.getBiography());
            model.addAttribute("birthdate", messi.getBirthDate());
            model.addAttribute("foot", messi.getFoot());
            model.addAttribute("birthplace", messi.getBirthPlace());
            model.addAttribute("currentclub", messi.getCurrentClub());
            model.addAttribute("height", messi.getHeight());
            model.addAttribute("honours", messi.getHonours());
            model.addAttribute("image", messi.getImageUrl());
            model.addAttribute("awards", messi.getIndividualAwards());
            model.addAttribute("number", messi.getJerseyNumber());
            model.addAttribute("nationality", messi.getNationality());
            model.addAttribute("position", messi.getPosition());
            model.addAttribute("records", messi.getRecords());
            model.addAttribute("seniorcareer", messi.getSeniorCareer());
            model.addAttribute("weight", messi.getWeight());
            model.addAttribute("youthcareer", messi.getYouthCareer());
            return "messi";
        }
}

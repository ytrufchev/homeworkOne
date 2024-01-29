package com.example.homeworkOne;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NationalTeamController {
    @GetMapping("/team")
    public String team(@RequestParam String team, Model model){
        if(team.equalsIgnoreCase("manunited")){
            ManUnited manUnited = new ManUnited();
            String players = "";
            for (int i = 0; i < manUnited.getNotablePlayers().length; i++) {
                players += manUnited.getNotablePlayers()[i] + ", ";
            }
            model.addAttribute("name", manUnited.getName());
            model.addAttribute("founded", manUnited.getFounded());
            model.addAttribute("stadium", manUnited.getStadium());
            model.addAttribute("manager", manUnited.getManager());
            model.addAttribute("trophiesWon", manUnited.getTrophiesWon());
            model.addAttribute("notablePlayers", players);
            return "team";
        }
        else if(team.equalsIgnoreCase("liverpool")){
            Liverpool liverpool = new Liverpool();
            String players = "";
            for (int i = 0; i < liverpool.getNotablePlayers().length; i++) {
                players += liverpool.getNotablePlayers()[i] + ", ";
            }
            model.addAttribute("name", liverpool.getName());
            model.addAttribute("founded", liverpool.getFounded());
            model.addAttribute("stadium", liverpool.getStadium());
            model.addAttribute("manager", liverpool.getManager());
            model.addAttribute("trophiesWon", liverpool.getTrophiesWon());
            model.addAttribute("notablePlayers", players);
            return "team";
        }
        else {
            return "sneakyyou";
        }
    }
}

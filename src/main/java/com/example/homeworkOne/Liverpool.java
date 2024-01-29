package com.example.homeworkOne;

public class Liverpool {
    private final String name = "Liverpool";
    private final String founded = "1892";
    private final String stadium = "Anfield";
    private final String manager = "Jurgen Klopp";
    private final int trophiesWon = 66;
    private final String[] notablePlayers = {"Steven Gerrard", "Kenny Dalglish", "Ian Rush", "Kevin Keegan", "Jamie Carragher"};

    public String getName() {
        return name;
    }

    public String getFounded() {
        return founded;
    }

    public String getStadium() {
        return stadium;
    }

    public String getManager() {
        return manager;
    }

    public int getTrophiesWon() {
        return trophiesWon;
    }

    public String[] getNotablePlayers() {
        return notablePlayers;
    }

    public Liverpool() {
    }
}

package com.example.homeworkOne;

public class ManUnited {
    private final String name = "Manchester United";
    private final String founded = "1878";
    private final String stadium = "Old Trafford";
    private final String manager = "Ralf Rangnick";
    private final int trophiesWon = 66;
    private final String[] notablePlayers = {"Sir Bobby Charlton", "Ryan Giggs", "Eric Cantona", "Roy Keane", "Cristiano Ronaldo"};

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

    public ManUnited() {
    }
}

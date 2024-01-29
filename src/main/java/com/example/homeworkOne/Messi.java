package com.example.homeworkOne;

public class Messi {
    private String fullName;
    private String birthDate;
    private String birthPlace;
    private String nationality;
    private String height;
    private String weight;
    private String position;
    private String currentClub;
    private String previousClubs;
    private String internationalTeam;
    private String jerseyNumber;
    private String foot;
    private String youthCareer;
    private String seniorCareer;
    private String nationalTeamDebut;
    private String nationalTeamAppearances;
    private String nationalTeamGoals;
    private String honours;
    private String individualAwards;
    private String records;
    private String biography;  // New field for the biography
    private String imageUrl;

    // Constructor
    public Messi() {
        this.fullName = "Lionel Andrés Messi";
        this.birthDate = "June 24, 1987";
        this.birthPlace = "Rosario, Argentina";
        this.nationality = "Argentine";
        this.height = "1.70 m (5 ft 7 in)";
        this.weight = "72 kg (159 lbs)";
        this.position = "Forward";
        this.currentClub = "Paris Saint-Germain";
        this.previousClubs = "Barcelona";
        this.internationalTeam = "Argentina";
        this.jerseyNumber = "30";
        this.foot = "Left";
        this.youthCareer = "Newell's Old Boys (1994–2000), Barcelona (2000–2003)";
        this.seniorCareer = "Barcelona (2003–2021), Paris Saint-Germain (2021–present)";
        this.nationalTeamDebut = "August 17, 2005";
        this.nationalTeamAppearances = "154";
        this.nationalTeamGoals = "81";
        this.honours = "Copa America (2021), Olympic Gold Medal (2008), FIFA Club World Cup (2009, 2011, 2015), UEFA Champions League (2008–09, 2010–11, 2014–15), La Liga (2004–05, 2005–06, 2008–09, 2009–10, 2010–11, 2012–13, 2014–15, 2015–16, 2017–18, 2018–19, 2020–21)";
        this.individualAwards = "7× Ballon d'Or (2009, 2010, 2011, 2012, 2015, 2019, 2021), 6× European Golden Shoe (2009–10, 2011–12, 2012–13, 2016–17, 2017–18, 2018–19)";
        this.records = "Most goals scored for a single club (Barcelona), Most goals scored in a calendar year, Most hat-tricks in La Liga history";
        this.biography = "Lionel Messi (born June 24, 1987, Rosario, Argentina) Argentine-born football (soccer) player who received a record-setting eight Ballon d’Or awards as the world’s top male player (2009–12, 2015, 2019, 2021, and 2023). In 2022 he helped Argentina win the Fédération Internationale de Football Association (FIFA)’s World Cup.";
        this.imageUrl = "https://fifpro.org/media/fhmfhvkx/messi-world-cup.jpg";
    }

    public String getFullName() {
        return fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public String getNationality() {
        return nationality;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }

    public String getPosition() {
        return position;
    }

    public String getCurrentClub() {
        return currentClub;
    }

    public String getPreviousClubs() {
        return previousClubs;
    }

    public String getInternationalTeam() {
        return internationalTeam;
    }

    public String getJerseyNumber() {
        return jerseyNumber;
    }

    public String getFoot() {
        return foot;
    }

    public String getYouthCareer() {
        return youthCareer;
    }

    public String getSeniorCareer() {
        return seniorCareer;
    }

    public String getNationalTeamDebut() {
        return nationalTeamDebut;
    }

    public String getNationalTeamAppearances() {
        return nationalTeamAppearances;
    }

    public String getNationalTeamGoals() {
        return nationalTeamGoals;
    }

    public String getHonours() {
        return honours;
    }

    public String getIndividualAwards() {
        return individualAwards;
    }

    public String getRecords() {
        return records;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}

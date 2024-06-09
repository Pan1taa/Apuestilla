package com.example.apuestilla;

public class Match {
    private final int homeTeamImage;
    private final String homeTeamName;
    private final int awayTeamImage;
    private final String awayTeamName;
    private final String score;
    private final String time;
    private final String betOption1;
    private final String betOptionX;
    private final String betOption2;

    public Match(int homeTeamImage, String homeTeamName, int awayTeamImage, String awayTeamName, String score, String time, String betOption1, String betOptionX, String betOption2) {
        this.homeTeamImage = homeTeamImage;
        this.homeTeamName = homeTeamName;
        this.awayTeamImage = awayTeamImage;
        this.awayTeamName = awayTeamName;
        this.score = score;
        this.time = time;
        this.betOption1 = betOption1;
        this.betOptionX = betOptionX;
        this.betOption2 = betOption2;
    }

    public int getHomeTeamImage() {
        return homeTeamImage;
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public int getAwayTeamImage() {
        return awayTeamImage;
    }

    public String getAwayTeamName() {
        return awayTeamName;
    }

    public String getScore() {
        return score;
    }

    public String getTime() {
        return time;
    }

    public String getBetOption1() {
        return betOption1;
    }

    public String getBetOptionX() {
        return betOptionX;
    }

    public String getBetOption2() {
        return betOption2;
    }
}
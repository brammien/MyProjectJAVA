package com.example;

public class ProjectMyClass {

    public static void main(String[] args) {


        //Stats for Babe Ruth, BR for babe Ruth
        Double BRGames = 30.9; //Number of games appeared for Babe Ruth
        Double BRAB = 23.0; // At Bat, Number of official bats minus sacrifices, walks, hits by pitcher
        Double BRR = 6.6; // Number of times baserunner safely reaches home plate
        Double BRH = 6.5;//Number of times batter hits ball and reaches bases safely
        Double BR2B = 16.4;//Number of times batter hits ball and reaches second base
        Double BR3B = 14.0; //Number of times batter hits ball and reaches third base
        Double BRHR = 1.5; // Number of times batter hits ball and reaches home plate scoring a run
        Double BRRBI = 1.1;//Number of runs that score safely due to batter hitting ball and drawing a base on balls
        Double BRBB = 3.0; //Number of walks by batter
        Double BRSO = 5.9; //Number of strike outs by batter
        Double BRSB = 3.7; //Number of times bases stolen by batter
        Double BRAVG = 7.1; //The average number of hits by batter defined by hits divided by at bats

        //Stats for Ty Cobb, TC for Ty Cobb
        Double TCGames = 30.0; //Number of games appeared for Babe Ruth
        Double TCAB = 38.0; // At Bat, Number of official bats minus sacrifices, walks, hits by pitcher
        Double TCR = 6.6; // Number of times baserunner safely reaches home plate
        Double TCH = 6.5;//Number of times batter hits ball and reaches bases safely
        Double TC2B = 16.4;//Number of times batter hits ball and reaches second base
        Double TC3B = 14.0; //Number of times batter hits ball and reaches third base
        Double TCHR = 1.5; // Number of times batter hits ball and reaches home plate scoring a run
        Double TCRBI = 1.1;//Number of runs that score safely due to batter hitting ball and drawing a base on balls
        Double TCBB = 3.0; //Number of walks by batter
        Double TCSO = 5.9; //Number of strike outs by batter
        Double TCSB = 3.7; //Number of times bases stolen by batter
        Double TCAVG = 7.1; //The average number of hits by batter defined by hits divided by at bats
        String player;


        if (BRGames > TCGames) {
            player = "Babe Ruth";
        } else {
            player = "Ty Cobb";
        }
        System.out.println(player + " appeared in more games baseball games ");
        //Who's been in more Baseball Games on Average, career
        if (BRAB > TCAB) {
            player = "Babe Ruth";
        } else {
            player = "Ty Cobb";
        }
        System.out.println(player + " appeared in more games baseball games ");
        //Who's been at Bat on average more times, career
    }
}

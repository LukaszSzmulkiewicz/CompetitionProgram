/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmentoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author User
 */
// creating the Competition class
public class Competition {

    
    
// creating the Competition class
    public double pointsRef1;
    public double pointsRef2;
    public double pointsRef3;
    private double competitionWinner;
    public String registeredTeamNames;
    public ArrayList<Team> competiton;

    Competition() {

    }
    // creating the Competition class constructor 
    Competition(String registeredTeamNames, double points1, double points2, double points3, double competitionWinner) {
        this.registeredTeamNames = registeredTeamNames;
        this.pointsRef1 = points1;
        this.pointsRef2 = points2;
        this.pointsRef3 = points3;
        this.competitionWinner = competitionWinner;

    }
   
    
     // creating getters and seters 
    public ArrayList<Team> getCompetition() {

        return competiton;
    }

    public void setPointsRef1(double pointsRef1) {

        this.pointsRef1 = pointsRef1;
    }

    public void setPointsRef2(double pointsRef2) {

        this.pointsRef2 = pointsRef2;
    }

    public void setPointsRef3(double pointsRef3) {

        this.pointsRef3 = pointsRef3;
    }

    public void setCompetitionWiner(double competitionWiner) {

        this.competitionWinner = competitionWiner;
    }
    
    // method to score projects by the judge - using for loop and scanner 
    public static double[] judgeScorePoints(ArrayList<Team> team) {
        Scanner sc = new Scanner(System.in);
        int teamsToScore = team.size();
        double[] arr = new double[teamsToScore];
        System.out.println("Please score all teams, the score range: 1-10");
        for (int i = 0; i < arr.length; i++) {
            Team data = team.get(i);
            System.out.println("Please score the: " + data.toString()+ " team");
            arr[i] = sc.nextDouble();

        }
        return arr;            
    }
    
    // method to combine teams and scores from the judges into an ArrayList using for loop
    public void scoreBoard(String registeredTeams[], double judge1[], double judge2[], double judge3[]) {
        ArrayList<Competition> list = new ArrayList<>();
        double score1 = 0;
        double score2 = 0;
        double score3 = 0;
        int n = registeredTeams.length;
        for (int i = 0; i < n; i++) {
          
            score1 = judge1[i];
            score2 = judge2[i];
            score3 = judge3[i];

            competitionWinner = score1 + score2 + score3;
            

            list.add(new Competition(registeredTeams[i],
                   judge1[i], judge2[i],
                    judge3[i], competitionWinner));

        }
        // calling the mehtod to print the scoreboard values
        printValues(list);
        
        // callling the method to print the winner
        theWinner(list);
    }

    // method to print the competition scoreboard using for loop
    public void printValues(ArrayList<Competition> list) {
        
        System.out.println();
        System.out.println("||||| COMPETITION SCOREBOARD |||||||");
        int n = list.size();
        
        for (int i = 0; i < n; i++) {

            Competition data = list.get(i);

            System.out.println(data.registeredTeamNames + " " + data.pointsRef1 + " "
                    + data.pointsRef2 + " " + data.pointsRef3);
        }

    }

    //method to calculate and print the competition winner, using for loop and if statment
    public void theWinner(ArrayList<Competition> list) {
        System.out.println();
        System.out.println("THE COMPETITION WINNER IS....");
        System.out.println();
        int n = list.size();
        double max = list.get(0).competitionWinner;
        for (int i = 1; i < n; i++) {

            Competition data = list.get(i);
            double result = data.competitionWinner;

            if (result > max) {
                max = result;
            } else {
                Collections.swap(list, i - 1, i);
            }

        }
        System.out.println("******************");
        System.out.println("  "+list.get(n - 1).registeredTeamNames+"  " );
        System.out.println("******************");
    }
}

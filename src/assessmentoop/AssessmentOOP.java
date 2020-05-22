/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmentoop;

import java.util.*;

/**
 *
 * @author ec1848306
 *
 */
public class AssessmentOOP {

  

    public static void main(String args[]) {

        /* Createing student objects */
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        Student st4 = new Student();
        Student st5 = new Student();
       
        // populating the student objects with details via addStudent method 
        // demenstruating the number exception created in the Person class - only numbers accepted 
        try {
            st1.addStudent("Mark", "Simons", "07A457A2282", "Edinburgh College", "2 Upper Street", "EC4828306", "Software Development", "Full Time");
            
            
        } catch (Exception e) {
            System.out.println(e);
            
        }
        st1.printStudent();
        System.out.println();
        
        // demonstrating the student ID exception created in the Student class - required EC at the beginning of the number
        try {
            st1.addStudent("Mark", "Simons", "07545772282", "Edinburgh College", "2 Upper Street", "4828306", "Software Development", "Full Time");

        } catch (Exception e) {
           System.out.println(e);
            
        }
        st1.printStudent();
        System.out.println();
        
        // demonstrating the student course exception 
        try {
            st1.addStudent("Mark", "Simons", "07545772282", "Edinburgh College", "2 Upper Street", "EC4828306", "Art", "Full Time");
            System.out.println();
            
        } catch (Exception e) {
            System.out.println(e);
            st1.printStudent();
        }
        st1.printStudent();
        System.out.println();
        
        // adding details to other student objects and printing the details with the student print method
        try {
            st1.addStudent("Mark", "Simons", "07545772282", "Edinburgh College", "2 Upper Street", "EC4828306", "Software Development", "Full Time");
            st1.printStudent();
            System.out.println();
            st2.addStudent("Lukasz", "Szmulkiewicz", "07545332255", "Edinburgh College", "2 Lower Street", "EC2928306", "Software Development", "Full Time");
            st2.printStudent();
            System.out.println();
            st3.addStudent("Michael", "Jordan", "07545442282", "Edinburgh College", "1 Gorge Street", "EC1128306", "Software Development", "Full Time");
            st3.printStudent();
            System.out.println();
            st4.addStudent("Kazimierz", "Dejna", "07545755282", "Edinburgh College", "Lazienkowska 3", "EC4828306", "Software Development", "Full Time");
            st4.printStudent();
            System.out.println();
            st5.addStudent("Kazimierz", "Dejna", "07545755282", "Edinburgh College", "Lazienkowska 3", "EC4828306", "Software Development", "Full Time");
            st5.printStudent();
        } catch (Exception e) {
            System.out.println(e);
        }
        
         System.out.println();
        
        // editing a student field with student edit method
        //st5.editStudent();
        //st5.printStudent();
        System.out.println();
                
        // removing student details with 
        st5.remove();
        System.out.println();
        
        // creating ArrayList with all student objects
        // the array will be passed as a parameter for the methods in the Team class
        ArrayList<Student> student = new ArrayList();
        student.add(st1);
        student.add(st2);
        student.add(st3);
        student.add(st4);
        
        /* Creating teacher objects using the class constructor */
        Teacher te1 = new Teacher();
        Teacher te2 = new Teacher();
        
        // adding the teacher details with addTeacher method and exceptions catch for the telephone number field
        try {
            te1.addTeacher("James", "Bond", "07711122233", "Edinburgh College", "1 Seacret Agent Street", "TE12583690", "judge123", "Software Development");
            te2.addTeacher("James", "Bond", "07711122233", "Edinburgh College", "1 Seacret Agent Street", "TE12583690", "judge123", "Software Development");   
        } catch (Exception e) {
            System.out.println(e);
        }
        te1.printTeacher();
        System.out.println();
        
        // editing teacher field with editTeacher() method and printing details with 
        // the printTeacher() method
       // te2.editTeacher();
        te2.printTeacher();
        System.out.println();
        
        // removing teacher details with remove() method
        //te2.remove();
       
        System.out.println();
        
       
        
        /* Creating team objects using the class constructor */
        Team tm1 = new Team();
        Team tm2 = new Team();
        Team tm3 = new Team();
        Team tm4 = new Team();
       
        // registering team via registerTeam() method, passing the arraylist with student objects 
        // reguires user input to the scanner object 
      tm1.registerTeam(student);

        // manually registering the team via registerTeam() method
        tm1.registerTeam("Smart Heads", "specialisation", "studentTeamID1", "studentTeamID2", "studentTeamID3", "studentTeamID4");
        tm2.registerTeam("Legia Warszawa", "Software Development", "ED1235802", "ED1235201", "ED007007", "ED1825305");
        tm3.registerTeam("Unicorns", "Software Development", "EC4828306", "ED1235802", "ED1235802", "ED1235802");
        tm4.registerTeam("Dragons", "Software Development", "ED1235802", "ED1235802", "EC4828306", "EC4828306");
       
        // Editing team details
        tm2.editTeam();
        tm2.printTeam();
        
        //Creating an ArrayList of teams registered for the competition
        //
        ArrayList<Team> team = new ArrayList();

        team.add(tm1);
        team.add(tm2);
        team.add(tm3);
        team.add(tm4);
        
        // creating a competition object via constructor for software development category 
         Competition software = new Competition();

        // declearing an array of strings and collecting all the team names from the ArrayList 
        // via overridden toString() mehtod
        String registeredTeamNames[] = {team.get(0).toString(), team.get(1).toString(),
            team.get(2).toString(), team.get(3).toString()};
        
       
        // declaring arrays for 3 judges scoring the competition
        // one of them populated via judgeScorePoints() method. 
        // The team arraylist is passed as a parameter into that method 

        double judge1[] = Competition.judgeScorePoints(team);
        double judge2[] = {4,5 , 7,5, 8, 6};
        double judge3[] = {3.5, 9, 7.5, 5.5};
      

       // showing competition scoreboard and the category winner
        software.scoreBoard(registeredTeamNames, judge1, judge2, judge3);

    }

}

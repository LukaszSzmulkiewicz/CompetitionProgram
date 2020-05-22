/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmentoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
// creating the Team class
public class Team extends Student {

    // declaring class attributes with an ArrayList collection of student details 
    private String teamName;
    private String specialisation;
    private String teamMember1;
    private String teamMember2;
    private String teamMember3;
    private String teamMember4;
    private String userName = "judge123";
    private String password = "password1";
    private ArrayList<Student> student;

    // empty constructor for the class, method registerTeam() will be responsible for
    //  registering the teams 
    Team() {

    }

    // getters and setters 
    public ArrayList<Student> getStudentID() {

        return student;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setSpecialisation(String spec) {
        this.specialisation = spec;
    }

    public void setTeamMember1(String teamMember1) {
        this.teamMember1 = teamMember1;
    }

    public void setTeamMember2(String teamMember2) {
        this.teamMember2 = teamMember2;
    }

    public void setTeamMember3(String teamMember3) {
        this.teamMember3 = teamMember3;
    }

    public void setTeamMember4(String teamMember4) {
        this.teamMember4 = teamMember4;
    }

    // method to register a team via user input, with  a username and password check - using while loop and if statements 
    public void registerTeam(ArrayList<Student> student) {
        Scanner sc = new java.util.Scanner(System.in);

        boolean detailsAccepted = false;

        while (!detailsAccepted) {
            this.userName = userName;
            this.password = password;
            System.out.println("Please enter your user name");
            String userNameEntry = sc.next();
            System.out.println("Please enter your password name");
            String passwordEntry = sc.next();
            System.out.println("Please enter the number of team members in the team");
            int numberInTeam = Integer.parseInt(sc.next());
            if (numberInTeam != 4) {
                System.out.println("Each team should have 4 members");
            }
            if (userNameEntry.equals(userName) && passwordEntry.equals(password) && numberInTeam == 4) {
                detailsAccepted = true;
                System.out.println("Access granted");
                System.out.println();
                System.out.println("Please enter the team name");
                String teamName = sc.nextLine() + sc.nextLine();
                this.teamName = teamName;
                System.out.println("Please enter the specialisation");
                String specialisation = sc.nextLine();
                this.specialisation = specialisation;

                System.out.println("Please enter the 1st team member ID");
                String studentTeamID1 = sc.next();
                for (Student s : student) {
                    if (student.toString().contains(studentTeamID1)) {
                        this.teamMember1 = studentTeamID1;
                    }
                }
                if (teamMember1 == null) {
                    System.out.println("This student is not registered for the competition, please edit this field after "
                            + "the registration is completed");
                }
                System.out.println("Please enter the 2nd team member ID");
                String studentTeamID2 = sc.next();
                for (Student s2 : student) {
                    if (student.toString().contains(studentTeamID2)) {
                        this.teamMember2 = studentTeamID2;
                    }
                }
                if (teamMember2 == null) {
                    System.out.println("This student is not registered for the competition, please edit this field after "
                            + "the registration is completed");
                }
                System.out.println("Please enter the 3rd team member ID");
                String studentTeamID3 = sc.next();
                for (Student s3 : student) {
                    if (student.toString().contains(studentTeamID3)) {
                        this.teamMember3 = studentTeamID3;
                    }
                }
                if (teamMember3 == null) {
                    System.out.println("This student is not registered for the competition, please edit this field after "
                            + "the registration is completed");
                }
                System.out.println("Please enter the 4rth team member ID");
                String studentTeamID4 = sc.next();
                for (Student s4 : student) {
                    if (student.toString().contains(studentTeamID4)) {
                        this.teamMember4 = studentTeamID4;
                    }
                }
                if (teamMember4 == null) {
                    System.out.println("This student is not registered for the competition, please edit this field after "
                            + "the registration is completed");
                }
                System.out.println("Registation complete, check the team details and edit if any changes are required ");
                printTeam();
            } else {

                detailsAccepted = false;
                System.out.println("Access denied!!");
                System.out.println();
            }

        }
    }

    // method to manually register a team - example of method overloading 
    public void registerTeam(String teamName, String specialisation, String studentTeamID1,
            String studentTeamID2, String studentTeamID3, String studentTeamID4) {
        this.teamName = teamName;
        this.specialisation = specialisation;
        this.teamMember1 = studentTeamID1;
        this.teamMember2 = studentTeamID2;
        this.teamMember3 = studentTeamID3;
        this.teamMember3 = studentTeamID4;

    }

    // method to edid team details - (using switch case)
    public void editTeam() {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Please enter the number related to the field you would like to edit: ");
        System.out.println("1. Specialisation, 2. Team name, 3. Team member 1, 4. Team member 2, 5. Team member 3, 6. Team member 4");
        int add = Integer.parseInt(sc.nextLine());

        System.out.println("Please enter new details for the field you would like to update");
        String change = sc.nextLine();

        switch (add) {

            case 1:
                add = 1;
                this.setSpecialisation(change);
                System.out.println("You have successfully updated the field number " + add + " to " + change);
                break;
            case 2:
                add = 2;
                this.setTeamName(change);
                System.out.println("You have successfully updated the field number " + add + " to " + change);
                break;
            case 3:
                add = 3;
                this.setTeamMember1(change);
                System.out.println("You have successfully updated the field number " + add + " to " + change);
                break;
            case 4:
                add = 4;
                this.setTeamMember2(change);
                System.out.println("You have successfully updated the field number " + add + " to " + change);
                break;
            case 5:
                add = 5;
                try {
                    this.setTeamMember3(change);
                    System.out.println("You have successfully updated the field number " + add + " to " + change);
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;
            case 6:
                add = 6;
                this.setTeamMember4(change);
                System.out.println("You have successfully updated the field number " + add + " to " + change);
                break;

        }

    }

    // method to print the team details
    public void printTeam() {
        System.out.println("Team name: " + teamName + " Competing in field of: " + specialisation);
        System.out.println("Team members: " + teamMember1 + ", " + teamMember2 +
                 ", " + teamMember3 + ", " + teamMember4);
    }

    // overriding toString() method, to be used in the competition class.
    @Override
    public String toString() {
        return teamName;
    }

}

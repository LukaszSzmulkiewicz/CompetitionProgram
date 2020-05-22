/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmentoop;

import java.util.Scanner;

// creating the Student class extending Person class
public class Student extends Person {

    // declaring class attributes 
    private String studentNo;
    private String studentCourse;
    private String studentStatus;

    // empty constructor for the class, method add Student will be responsible for
    // filing in the details for the instance of the class
    Student() {
    }

    // getters and setters with Exceptions for the student ID and the student course fields
    public void setstudentNoExc(String studentID) {

        this.studentNo = studentID;
    }

    public void setstudentNo(String studentID) throws Exception {

        if (studentID.toUpperCase().startsWith("EC")) {
            this.studentNo = studentID;
        } else {
            throw new Exception(studentID + " -INVALID STUDENT ID! "
                    + "Student ID should begin with EC. Please try again!");
        }
    }

    public String getStudentNo() {

        return this.studentNo;
    }

    public void setstudentCourse(String studentCourse) {
        if (studentCourse.equalsIgnoreCase("Software Development") || studentCourse.equalsIgnoreCase("Networking")
                || studentCourse.equalsIgnoreCase("Web Design")) {
            this.studentCourse = studentCourse;
        } else {
            this.studentCourse = "INVALID ENTRY";
            
            System.out.println("Only the following specialities can participate in the competition: "
                    + "Software Development, Networking or Web Design");
            System.out.println("Please edit the Student Course field! ");
        }

    }
    
    private void setstudentCourseNoExc(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    public String getStudentCourse() {

        return this.studentNo;
    }

    public void setstudentStatus(String studentStatus) {
        this.studentStatus = studentStatus;
    }

    public String getStudentStatus() {

        return this.studentStatus;
    }

    // method to add Strudent combined with addPerson() method from the Person class
    public void addStudent(String firstName, String surname, String telephone, String coleage, String adress,
             String studentNo, String studentCourse, String studentStatus) throws Exception {

        super.addPerson(firstName, surname, telephone, coleage, adress);
        this.setstudentNo(studentNo.toUpperCase());
        this.setstudentCourse(studentCourse);
        this.setstudentStatus(studentStatus);

    }

    // method to edit Student details with use of Exceptions - (implemented with switch case)
    public void editStudent() {
        Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Please enter the number related to the field you would like to edit: ");
        System.out.println("1. First Name, 2. Surname, 3. Telephone Number, 4. Address, 5. Colage Name, 6. Course Name,"
                + "\n" + "7. Student Number, 8. Student Status");
        int add = Integer.parseInt(sc.nextLine());

        System.out.println("Please enter new details of the field you would like to update");
        String change = sc.nextLine();

        switch (add) {

            case 1:
                add = 1;
                this.setPerFirstName(change);
                System.out.println("You have successfully updated the field number " + add + " to " + change);
                break;
            case 2:
                add = 2;
                this.setPerSurname(change);
                System.out.println("You have successfully updated the field number " + add + " to " + change);
                break;
            case 3:
                add = 3;
                try {
                    this.setTelNumber(change);
                    System.out.println("You have successfully updated the field number " + add + " to " + change);
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;
            case 4:
                add = 4;
                this.setPerAddress(change);
                System.out.println("You have successfully updated the field number " + add + " to " + change);
                break;
            case 5:
                add = 5;
                this.setColName(change);
                System.out.println("You have successfully updated the field number " + add + " to " + change);
                break;
            case 6:
                add = 6;
                this.setstudentStatus(change);
                System.out.println("You have successfully updated the field number " + add + " to " + change);
                break;
            case 7:
                add = 7;
                try {
                    this.setstudentNo(change);
                    System.out.println("You have successfully updated the field number " + add + " to " + change);
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;
            case 8:
                add = 8;
                this.setstudentStatus(change);
                System.out.println("You have successfully updated the field number " + add + " to " + change);
                break;

        }

    }
    // method to print the Student details, combined with the printPerson() method
    // from the abstract class
    public void printStudent() {
        super.printPerson();
        System.out.print("Student ID: " + studentNo + " ");
        System.out.print("Course: " + studentCourse + " ");
        System.out.println("Status: " + studentStatus + " ");

    }
    
    // overriden toString() method used for registerTeam() method in the Team class
      @Override
    public String toString() {
        return studentNo;
    }
    // overridden Person abstract method remove() used to remove the student details
    
    @Override
    public void remove() {
        this.setPerFirstName("---");
        this.setPerSurname("---");
        this.setstudentNoExc("---");
        this.setColName("---");
        this.setPerAddress("---");
        this.setstudentCourseNoExc("---");
        this.setTelNumberNoExc("---");
        this.setstudentStatus("---");
        System.out.println("You have successfully deleted the record");
        printStudent();

    }

    

}

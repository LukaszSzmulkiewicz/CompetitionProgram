/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmentoop;

/**
 *
 * @author User
 */
// creating the Teacher class extending Person class
 public class Teacher extends Person {
     
    // declaring class attributes 
    private String teacherID;
    private String judgeID;
    private String judgeArea;
    
    // empty constructor for the class, method add Teacher will be responsible for
    // filing in the details for the instance of the class
    public Teacher() {
        
    }
    // getters and setters 
      public void setTeacherID (String teacherID) {
      this.teacherID = teacherID;
   }        
     public void setJudgeID (String judgeID) {
      this.judgeID = judgeID;
     }
    
    public void setJudgeArea (String judgeArea) {
      this.judgeArea = judgeArea;
     }
     
      
     // addTeacher() method combined with the addPerson() method from the Person class 
    public void addTeacher(String firstName, String surname, String telephone, String coleage, String adress, 
            String teacherID, String judgeID, String judgeArea) throws Exception{
        
        super.addPerson(firstName, surname, telephone, coleage, adress);       
        this.setTeacherID(teacherID);
        this.setJudgeID(judgeID);
        this.setJudgeArea(judgeArea);
        
    }

   // method to edit the teacher details - (using switch case)
    public void editTeacher() {
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.println("Please enter a number coresponding to the field you would like to edit ");
        System.out.println("1. First Name, 2. Surname, 3. Telephone Number, 4. Address, 5. Colage Name, 6. Teacher ID,"
                + "\n" + "7. Judge ID, 8. Judge Area");
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
                this.setTeacherID(change);
                System.out.println("You have successfully updated the field number " + add + " to " + change);
                break;
            case 7:
                add = 7;
                try {
                    this.setJudgeID(change);
                    System.out.println("You have successfully updated the field number " + add + " to " + change);
                } catch (Exception e) {
                    System.out.println(e);
                }
                break;
            case 8:
                add = 8;
                this.setJudgeArea(change);
                System.out.println("You have successfully updated the field number " + add + " to " + change);
                break;
        }

    }
    //method to print the Teacher details, combined with the printPerson() method
    // from the abstract class
      public void printTeacher(){
      super.printPerson();
      System.out.print("Teacher ID: "+ teacherID +" ");
      System.out.print("Judge ID " + judgeID +" " );
      System.out.println("Judge Area " + judgeArea +" ");
      
    }    
    
        // overridden Person abstract method remove() used to remove the student details
    @Override
     public void remove() {
     this.setPerFirstName("---");
     this.setPerSurname("---");
     this.setColName("---");
     this.setPerAddress("---");
     this.setTelNumberNoExc("---");
     this.setJudgeArea("---");
     this.setJudgeID("---");
     this.setTeacherID("---");
     
    System.out.println("You have successfully deleted the Teacher details");
    this.printTeacher();
        
    }
   
   }
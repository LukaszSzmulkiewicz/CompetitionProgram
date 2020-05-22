/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmentoop;

/**
 *
 * @author ec1848306
 */
// Creating the abstract Person class 
public abstract class Person {

    // Declaring class atributes
    private String personSurname;
    private String personFirstName;
    private String telephoneNumber;
    private String collegeName;
    private String address;

    // This is the constructor of the class Person
    Person() {

    }

    // Creating getters and setters. Field telephone number will throw an Exception
    public void setPerSurname(String perSurname) {
        this.personSurname = perSurname;

    }

    public String getPerSurname() {
        return personSurname = this.personSurname;
    }

    public void setPerFirstName(String pFirstName) {
        this.personFirstName = pFirstName;
    }

    public String getPerFirstName() {
        return personFirstName = this.personFirstName;
    }

    public void setTelNumber(String telNum) throws Exception {
        if (telNum.matches("[0-9]+")) {
            this.telephoneNumber = telNum;
        } else {
            throw new Exception(telNum + "- INVALID NUMBER!. This field should only contain"
                    + " numbers. Please try again!");

        }
    }
    
    // setter without an exception used for remove method
    public void setTelNumberNoExc(String telNum) {

        this.telephoneNumber = telNum;

    }

    public String getTelNumber() {
        return telephoneNumber = this.telephoneNumber;
    }

    public void setColName(String cName) {
        this.collegeName = cName;
    }

    public String getColName() {
        return collegeName = this.collegeName;
    }

    public void setPerAddress(String pAddress) {
        this.address = pAddress;
    }

    public String getPerAddress() {
        return address = this.address;
    }
    // method to add Person 
    public void addPerson(String firstName, String surname, String telephone, String coleage, String adress)
            throws Exception {
        this.setPerFirstName(firstName);

        this.setPerSurname(surname);

        this.setTelNumber(telephone);

        this.setColName(coleage);

        this.setPerAddress(adress);
    }
    
    // abstract method to remove a student or teacher object
    public abstract void remove();

    // Print the Person details
    public void printPerson() {
        System.out.print("Surname: " + personSurname + " ");
        System.out.print("First Name: " + personFirstName + " ");
        System.out.print("Telephone number: " + telephoneNumber + " ");
        System.out.print("Collage name: " + collegeName + " ");
        System.out.println("Address: " + address + " ");
    }

}

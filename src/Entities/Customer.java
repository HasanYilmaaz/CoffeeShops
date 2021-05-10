package Entities;

import Abstract.Entity;

public class Customer implements Entity {
    public Customer() {

    }

    public Customer(int id, String firstName, String lastName, int dateOfBirth, String nationalityID) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        NationalityID = nationalityID;
    }

    private int id;
    private String firstName;
    private String lastName;
    private int dateOfBirth;
    private String NationalityID;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalityID() {
        return NationalityID;
    }

    public void setNationalityID(String nationalityID) {
        NationalityID = nationalityID;
    }

}
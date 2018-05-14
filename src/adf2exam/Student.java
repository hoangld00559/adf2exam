/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adf2exam;

import java.io.Serializable;

/**
 *
 * @author MyPC
 */
public class Student implements Serializable{
    private String enrolID;
    private String firstName;
    private String lastName;
    private int age;

    public Student() {
    }

    public Student(String enrolID, String firstName, String lastName, int age) {
        this.enrolID = enrolID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getEnrolID() {
        return enrolID;
    }

    public void setEnrolID(String enrolID) {
        this.enrolID = enrolID;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}

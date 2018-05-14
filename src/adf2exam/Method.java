/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adf2exam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPC
 */
public class Method {

    private ArrayList<Student> list = new ArrayList<>();
//    ArrayList<Student> listout = new ArrayList<>());
    private Scanner input = new Scanner(System.in);

    public void addStudent() {
        System.out.println("Enter enrolId:");
        String enrolId = input.nextLine();
        System.out.println("Enter first name:");
        String firstName = input.nextLine();
        System.out.println("Enter last name:");
        String lastName = input.nextLine();
        System.out.println("Enter age:");
        int age = input.nextInt();
        input.nextLine();
        Student student = new Student(enrolId, firstName, lastName, age);
        list.add(student);
    }

    public void displayStudent() {
        InputStream input = null;
        ObjectInputStream ois = null;
        try {
            input = new FileInputStream("D:\\students.dat");
            ois = new ObjectInputStream(input);
            System.out.println("EnrolId    |       FullName      |   Age");
            Student st = (Student) ois.readObject();
            System.out.printf("%5s  %15s  %15d", st.getEnrolID(), st.getFirstName() + st.getLastName(), st.getAge());
            System.out.println("");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            try {
                ois.close();
                input.close();
            } catch (IOException ex) {
                Logger.getLogger(Method.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void saveStudent() {
        FileOutputStream file = null;
        ObjectOutputStream oos = null;
        try {
            file = new FileOutputStream("D:\\students.dat", true);
            oos = new ObjectOutputStream(file);
            for (int i = 0; i < list.size(); i++) {
                oos.writeObject(list.get(i));
                System.out.println("Success!");
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                oos.close();
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(Method.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}

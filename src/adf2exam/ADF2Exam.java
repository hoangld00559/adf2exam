/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adf2exam;

import java.util.Scanner;

/**
 *
 * @author MyPC
 */
public class ADF2Exam {

    private static Scanner input;

	/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        input = new Scanner(System.in);
        Method method = new Method();
        System.out.println("afsdfd");
        int n;
        do {
            System.out.println("========Students=========");
            System.out.println("1. Add new student");
            System.out.println("2. Save");
            System.out.println("3. Display all students");
            System.out.println("4. Exit");
            System.out.println("--------------------------");
            System.out.println("Please enter your choice:");
            n = input.nextInt();
            switch(n){
                case 1: 
                    method.addStudent();
                    break;
                case 2:
                    method.saveStudent();
                    break;
                case 3:
                    method.displayStudent();
                    break;
                case 4:
                    System.out.println("Bye bye");
                default:
                    System.out.println("Wrong!");
            }
        }while(n!=4);
    }
    
}

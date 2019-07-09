/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8;

import java.util.Scanner;

/**
 *
 * @author jlapi
 */
public class Human {

    private String name = "";
    private String surname = "";
    private int age = 0;

    public void setName(String name) {
        this.name = name; //this norada uz attiecigo instanci, t.i. name
        if (name.equals("")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Jus neievadijat vardu!");
            name = sc.next();
        }
        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.charAt(i))) {
                this.name = "Ievades kluda!";
            }
        }
    }

    public void setSurname(String surname) {
        this.surname = surname;
        if (this.surname.equals("")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Jus neievadijat uzvardu!");
            surname = sc.next();
        }
        for (int i = 0; i < surname.length(); i++) {
            if (Character.isDigit(surname.charAt(i))) {
                this.surname = "Ievades kluda!";
            }
        }

    }

    public void setAge(int age) {

        if (age < 1) {
            age = 1;
        }
        if (age < 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Kluda!");
        }
        this.age = age;

    }

    public String getName() {
        if (this.name.equals("")) {
            System.out.println("");
            Scanner sc = new Scanner(System.in);
            this.name = sc.next();
        }
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void yearOfBirth() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter this year: ");
        int thisYear = sc.nextInt();

        int yearOfBirth = thisYear - this.age;
        System.out.println("Your year of birth is " + yearOfBirth);

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

import java.util.Scanner;

/**
 *
 * @author jlapi
 */
public class Tasks {
    public static void DayNumber(){
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Ludzu ievadiet skaitli");
        try{
        int number = sc.nextInt();
        String weekDay;
        switch(number){
            case 1: weekDay = "Monday";
            break;
            case 2: weekDay = "Tuesday";
            break;
            case 3: weekDay = "Wednesday";
            break;
            case 4: weekDay = "Thursday";
            break;
            case 5: weekDay = "Friday";
            break;
            case 6: weekDay = "Saturday";
            break;
            case 7: weekDay = "Sunday";
            break;
            default: weekDay = "Invalid number!";
            break; 
        }
        System.out.println(weekDay);}
        catch(Exception ex){System.out.println("Error!");
    }
}}

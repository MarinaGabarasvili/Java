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
    
    
        
    }
    public void FactCount(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Ludzu ievadiet veselu skaitli: ");
        
        try{
        int number = sc.nextInt();
        int fact = 1;
        
        for(int i = 1; i <= number; i++ ){
            fact = fact * i;
        } System.out.println("Rezultats ir " + fact);}
        
        catch (Exception ex){
            System.out.println("Error!");
        }
           
        
            
        
}
    public void MatchNumber(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Ludzu ievadiet veselu skaitli: ");
        int number = sc.nextInt();
        int number2 = 0;
        while(number != number2){
            System.out.println("Ludzu uzminiet skaitli: ");
            number2 = sc.nextInt();
            if(number != number2){
            System.out.println("Meginiet velreiz");}
            
        } System.out.println("Jus uzminejat!");
    }}
    

    

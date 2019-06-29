/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

import java.util.Scanner;

/**
 *
 * @author jlapi
 */
public class Day1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              sum(2,3);
              
    Scanner sc = new Scanner(System.in);
    System.out.println("Ievadiet pirmo skaitli: ");
    int x = sc.nextInt();
    System.out.println("Ievadiet otro skaitli: ");
    int y = sc.nextInt();
    System.out.println("Kadu darbibu veikt: + vai -");
    String count = sc.next();
    sumOrSubstract(x,y,count);
   
    }
    
            
    private static void sum (int a, int b){
        System.out.println(a+b);
}
    private static void example(){
        System.out.print("Hello world2!");//bez enter
        System.out.println("Hello world!");// ar enter
        
        //mainigo tipi ir tie pasi, kas C#
        
         Scanner sc = new Scanner(System.in);//klase Scanner
         System.out.println("Ievadiet tekstu!");
         String text = sc.nextLine();//ievade konsole
         
         System.out.println("Ievadiet skaitli!");
         int number = sc.nextInt();//ievadam skaitli
         
         System.out.println(text);//izvade
         
         if(number == 3){
            //if skaitliem
         } else{
         
         }
         
         if(text.equals("vii")){
         //if stringam Ja van vienads, tad prieksaa liekam !
         }
    }
    private static void sumOrSubstract(int x, int y, String count){
    
    if(count.equals("+"))
    {System.out.println(x+y);} 
    else if(count.equals("-"))
    {System.out.println(x-y);}
    else{System.out.println("Kluda!");}
    
}}

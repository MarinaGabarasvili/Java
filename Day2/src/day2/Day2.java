/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

import java.util.Scanner;

/**
 *
 * @author jlapi
 */
public class Day2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        power(3,3);
//        power(4,3);
//        power(5,3);

            fun1();
            
//        for(int i = 0; i<5; i++){
//        fun1();}

        funWithParams(3,4.4,"seit ir strings");
        funWithParams(2,2.5,"vii!");
        
        int number2 = funWithReturn();
        System.out.println(number2);
        
        funWithReturn(); //var izsaukt funkciju bez mainiga, bet tada 
                            //gadijuma vina neur nesaglabasies un ar to neko 
                            //nevares izdarit
                            
        Scanner reader = new Scanner (System.in);
        System.out.print("Ludzu ievadiet skaitli: ");
        int number = reader.nextInt();
        checkNumber(number);
        

    }
    private static void loopExamples(){
//while, for, foreach, do...while
    for(int i = 0; i<5; i++)
{
    System.out.println(i);
}
        System.out.println();
        
    for(int i = 11; i >5; i--)
    {
        System.out.println(i);
    }
    System.out.println();
    
    int number = 0;
    while (number <5)
    {
        System.out.println(number);
        number++;
    }
        System.out.println();
        
    number = 0;
    do 
    {
        System.out.println(number);
        number++;
    }
    while(number<5);
    
    
    
}
    private static void stars ()
    {
        String star = "";
        for(int i = 0; i<4; i++){
            star = star + "*";
            System.out.println(star);}}
        
    private static void power (int base, int pow){
        int result = 1;
        for(int i=0; i<pow; i++){
            result = result * base;
            //System.out.println(result);
        }
        System.out.println(result);//gala rezultats
    }
    
    private static void fun1(){
        System.out.println("Funkcija kko dara");
    }
    
    private static void funWithParams(int a, double b, String c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    private static int funWithReturn(){
        int c = 5+7;
        return c;
    }
    
    private static void checkNumber(int userInputNumber){
        if (userInputNumber > 5)
        {
            System.out.println("*");
        } else 
        {System.out.println("**");}
    }
}

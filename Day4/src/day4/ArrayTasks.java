/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jlapi
 */
public class ArrayTasks {
    
    public void arrayFromUserInput()
   {
    
    Scanner sc = new Scanner (System.in);
        System.out.println("Please enter array length: ");
        int size = sc.nextInt();
        int array [] = new int [size];
        double sum = 0;
        
        System.out.println("Please enter " + size +  " array elements: ");
        
        for(int i = 0; i < array.length; i++){
            
            array [i] = sc.nextInt();
            sum += array[i];
            
        }
        double avr = sum/array.length; 
        System.out.println("Your array average is: " + avr);
        
      
        
    }
    public void task2(){
        int a = 5;
        int b = 4;
        int c;
        c = a;
        a = b;
        b = c;   //sis variants ir labak, jo ir parskatamak    
                
         
        System.out.println(a);
        System.out.println(b);
    }
    public void task3 (){
        int a = 5;
        int b = 4;
        
        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println(a);
        System.out.println(b);
        
    }
    public void task4(){
    Scanner sc = new Scanner (System.in);
        System.out.println("Please enter array length: ");
        int size = sc.nextInt();
        int array [] = new int [size];
        
        for(int i = 0; i < array.length; i++){
            System.out.println("Please enter " + (i+1) +  " array elements: ");
            array [i] = sc.nextInt();
        
        }
        System.out.println("Your array is: ");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        
        int n = array.length;
        for(int j = 0; j < n-1; j++){
            for (int k = 0; k < n-j-1; k++){
                if(array[k]>array[k+1]){
                    int swap = array[k];
                    array[k] = array [k+1];
                    array[k+1] = swap;
                    }}}
        
        System.out.println("Your sorted array is ");
        for(int i = 0; i < array.length; i++){
        System.out.println(array[i]);
        }
        
        
        
}
    public void ListExample(){
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("Saraksta vertiba");
        lst.add("vel viena vertiba");
        
        for(int i = 0; i <lst.size(); i++){
            System.out.println(lst.get(i));
        }
        
        for (String value : lst){
            System.out.println(value);
        }
         
    }
    
    
    
    
}

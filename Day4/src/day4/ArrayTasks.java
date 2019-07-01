/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

import java.util.Scanner;

/**
 *
 * @author jlapi
 */
public class ArrayTasks {
    
    public void arrayFromUserInput(){
    
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
}

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
public class ArrayExamples {
    public void sample1(){
        
        Scanner sc = new Scanner (System.in);
        int [] arr1  = new int [3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 4;
        System.out.println(arr1[0]); //masiva dinamiski skaitlus neliek, tam izmanto listu
        
        for(int i = 0; i<arr1.length; i++){
            System.out.println(arr1[i]);
            arr1[i] = sc.nextInt();
        }
       
    }
    
}

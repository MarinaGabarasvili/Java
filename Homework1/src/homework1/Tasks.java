/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jlapi
 */
public class Tasks {
    
    public void numberInput(){
        
        Scanner sc = new Scanner(System.in);
     
        List<Integer> list = new ArrayList<>();
        String answer;
        int input;
        do{
            System.out.print("Please enter number:");
            input = sc.nextInt();
            list.add(input);
            System.out.print("Gribat turpinat ievadi? ");
            answer = sc.next();
           
            if("no".equals(answer));
        } while("yes".equals(answer));
        
        System.out.println("Your numbers are: " + list );
        int countN = 0;
        int countP = 0;
        int countZ = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > 0){countP++;}
            if(list.get(i) < 0){countN++;}
            if (list.get(i) == 0){countZ++;}
            }System.out.println("Positive numbers: " + countP);
            System.out.println("Negative numbers: " + countN);
            System.out.println("Zeros: " + countZ);
            
        }
       
        
        
//        Scanner sc = new Scanner(System.in);
//     
//        char [] a;//kka partaisit par listu
//        String answer;
//        do{
//            System.out.print("Please enter number:");
//            a = sc.next().toCharArray();// uztaisit add.list
//            System.out.print("Gribat turpinat ievadi? ");
//            answer = sc.next();
//            
//            if("no".equals(answer));
//        } while("yes".equals(answer));
//        
//        System.out.println("Your numbers are: " + Arrays.toString(a) );//+list
//        
//       
        }
        

        
    

    


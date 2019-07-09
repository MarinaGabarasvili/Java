 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9;

import java.util.ArrayList;

/**
 *
 * @author jlapi
 */
public class Day9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FileOperationsEx fileIO = new FileOperationsEx();
        fileIO.readSampleFile();
        
        ArrayList data = fileIO.getFileContent();
        
        int sum = 0;
        
        for(var i : data){
            
            sum = sum+(int) i;
            
        } 
        
        System.out.println(sum);
        
        
        
    }
    
}

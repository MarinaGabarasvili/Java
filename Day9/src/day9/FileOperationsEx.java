/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jlapi
 */
public class FileOperationsEx {
    
    public void readSampleFile() {
        try {//ielasam failu
            Scanner scanner = new Scanner(new File("C:\\Users\\jlapi\\Desktop\\sample.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                int number = Integer.valueOf(line);
                System.out.println(number);
                inputList.add(number);
                //process the line
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Fails nav atrasts!!!");
        }

    }
    
    private ArrayList inputList;

    public FileOperationsEx() {
        
        inputList = new ArrayList<Integer>();
        
    }
    
    public ArrayList<Integer> getFileContent() {

        return inputList;

    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jlapi
 */
public class FileOperations {

//    public void readSampleFile() {
//        try {//ielasam failu
//            Scanner scanner = new Scanner(new File("C:\\Users\\jlapi\\Desktop\\sample.txt"));
//            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                System.out.println(line);
//                //process the line
//            }
//        } catch (FileNotFoundException ex) {
//            System.out.println("Fails nav atrasts!!!");
//        }
//
//    }

    private ArrayList inputList; //list veidosana no faila! 1.

    public FileOperations() {
        inputList = new ArrayList<String>();// 2.
    }

    public void readPersonFile() {
        try {//ielasam failu
            Scanner scanner = new Scanner(new File("C:\\Users\\jlapi\\Desktop\\Ex1.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println("No faila ielasíts-" + line);
                inputList.add(line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Fails nav atrasts!!!");
        }

    }

    public ArrayList<String> getFileContent() {

        return inputList;//3.atgriezam listaa

    }

}

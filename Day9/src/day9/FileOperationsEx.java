/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
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

    public void writeFile() {

        File file = new File("C:\\Users\\jlapi\\Desktop\\sample2.txt");

        FileWriter writer;
        try {
            writer = new FileWriter(file); //parraksta no jauna esoso failu
            writer = new FileWriter(file,true);//liek klat teksu esosam failam
            writer.write("This\n is\n an\n example2\n");
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println("Rakstit neizdevas!");
        }
    }

}

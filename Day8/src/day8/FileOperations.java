/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author jlapi
 */
public class FileOperations {

    public void readSampleFile() {
        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\jlapi\\Desktop\\sample.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
                //process the line
            }}
        catch (FileNotFoundException ex) {
            System.out.println("Fails nav atrasts!!!");
                }

        }

    }

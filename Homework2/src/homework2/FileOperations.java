/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jlapi
 */
public class FileOperations {

    public void readSampleFile() {
        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\jlapi\\Desktop\\poem.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println("No faila ielasíts-" + line);
                inputList.add(line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Fails nav atrasts!!!");
        }

    }

    private ArrayList inputList;
    public ArrayList outputList;

    public FileOperations() {

        inputList = new ArrayList<String>();
    }

    public ArrayList<String> getFileContent() {

        return inputList;

    }

    public void writeFile() {

        File file = new File("C:\\Users\\jlapi\\Desktop\\poem1.txt");
        ArrayList data = getFileContent();
        FileWriter writer;
        try {
            writer = new FileWriter(file);
            
            for (int i = data.size() - 1; i >= 0; i--) {
            writer.write((String) data.get(i));
           }
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println("Rakstit neizdevas!");
        }
    }

}

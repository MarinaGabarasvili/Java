/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

import java.util.ArrayList;

/**
 *
 * @author jlapi
 */
public class Homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        FileOperations fileIO = new FileOperations();
        fileIO.readSampleFile();

        FileOperations fileIO1 = new FileOperations();
        fileIO1.writeFile();
}}

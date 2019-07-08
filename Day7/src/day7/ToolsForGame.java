/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7;

/**
 *
 * @author jlapi
 */
public class ToolsForGame {

    public static String replaceCharUsingCharArray(String str, char ch, int index) {

        char[] chars = str.toCharArray();
        chars[index] = ch;
        return String.valueOf(chars);

    }

    public static String compare(String input, String toGuess) {
        String result = "";

        try {
            for (int i = 0; i < toGuess.length(); i++) {

                if (input.charAt(i) == toGuess.charAt(i)) {
                    result += toGuess.charAt(i)+ " ";
                } else {
                    result += "_ ";
                }
            }

        } catch (Exception ex) {
            for(int i = 0; i <  toGuess.length()-input.length(); i++){
            result += "_ "; 
        }}
      

//        int missingLength;
//
//        if (input.length() > toGuess.length()) {
//            missingLength = input.length() - toGuess.length();
//            for (int i = 0; i < missingLength; i++) {
//                result += " ";
//            }
//
//        } else {
//            missingLength = toGuess.length() - input.length();
//            for (int i = 0; i < missingLength; i++) {
//                result += "_ ";
//            }
//        }
        
        return result;

    }
}

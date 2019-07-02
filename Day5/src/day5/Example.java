/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

/**
 *
 * @author jlapi
 */
public class Example {
    
    private int field1 = 5; //publiskais mainigais pieejams visa klasee
    private int field2 = 6; //privatais mainigais
    
    public void sample1(){
        int a = 5;//mainigais pieejams tikai noteikta metode
        System.out.println("Demo text!");
        field2 = 11;
    }
    
    public void sample2(){
        System.out.println(field2);
        sample3();
    }
    
    public int getField1(){
        return field1;
    }
    
    public void setField1(int value){
        value = field1;
        if(value > 10){
            value =10;
        }else if (value < 0){
            value = 0;
        }
            
        }
    private void sample3(){
        System.out.println("So arpuse nepietosim!");  
    }
    
    
        
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

import java.util.Scanner;

/**
 *
 * @author jlapi
 */
public class Triangle {
    
    private int edgeA = 0;
    private int edgeB = 0;
    private int edgeC = 0;
    
    public void setEdgeA( int edgeA){
        
        while(edgeA == 0){
            Scanner sc = new Scanner(System.in);
            System.out.print("Mala nevar but vienáda nullei! Ievadiet vertibu: ");
            edgeA = sc.nextInt();
        }
        this.edgeA = edgeA;
        
    }
    
    public void setEdgeB( int edgeB){
        while(edgeB == 0){
            Scanner sc = new Scanner(System.in);
            System.out.print("Mala nevar but vienáda nullei! Ievadiet vertibu: ");
            edgeB = sc.nextInt();
        }
        this.edgeB = edgeB;
        
    }
    
    public void setEdgeC( int edgeC){
        while(edgeC == 0){
            Scanner sc = new Scanner(System.in);
            System.out.print("Mala nevar but vienáda nullei! Ievadiet vertibu: ");
            edgeC = sc.nextInt();
        }
        this.edgeC = edgeC;
        
    }
    
    public int getEdgeA() {
        return edgeA;
    }
    
    public int getEdgeB() {
        return edgeA;
    }
    
    public int getEdgeC() {
        return edgeA;
    }
    
    public void GetPerimeter(){
        
        int perimeter = this.edgeA + this.edgeB + this.edgeC;
        
        if( this.edgeA==0 || this.edgeB==0 || this.edgeC==0 ){
            System.out.println ("Ievades kluda!");
        } else {
        System.out.println ("Triangle perimeter is " + perimeter);
        }
    }
}

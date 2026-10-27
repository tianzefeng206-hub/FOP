/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB3;
import java.util.Random;
/**
 *
 * @author Lenovo
 */
public class Q4 {
    public static void main(String[]args){
        
    
    Random rand = new Random();
    
    int p1r1 = rand.nextInt(1,7);
    int p1r2 = rand.nextInt(1,7);
    
    int p1 = p1r1 + p1r2;
    
    int p2r1 = rand.nextInt(1,7);
    int p2r2 = rand.nextInt(1,7);
     int p2 = p2r1+ p2r2;
     
        System.out.println("Player1 roll1: "+p1r1);
        System.out.println("Player1 roll2: "+p1r2);
        System.out.println("Player2 roll1: "+p2r1);
        System.out.println("Player2 roll2: "+p2r2);
     if(p1>p2){
         System.out.println("Player1 wins");
     }else if (p2>p1){
         System.out.println("Player2 wins");
     }else{
         System.out.println("Draw");
     }
}
}

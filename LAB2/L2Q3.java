/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2;
import java.util.Random;

/**
 *
 * @author Lenovo
 */
public class L2Q3 {
    public static void main(String[] args){
        Random rand = new Random();
    int num1 = rand.nextInt(41)+10;
    int num2 = rand.nextInt(41)+10;
    int num3 = rand.nextInt(41)+10;
        System.out.println("The 1st number is "+ num1);
        System.out.println("The 2nd number is "+ num2);
        System.out.println("The 3rd number is "+ num3);
        int sum = num1 + num2 + num3;
        double avg = sum/3;
        System.out.println("The sum od 3 numbers is: " + sum);
        System.out.println("The average of 3 numbers is: "+ avg);
        
        
               
    }
    
}

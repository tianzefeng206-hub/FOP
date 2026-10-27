/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class L2Q6 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of water in grams: ");
        double gram = sc.nextDouble();
        double M = gram/1000;
        System.out.println("Enter the initial temperature in Fahrenheit: ");
        double fah = sc.nextDouble();
        System.out.println("Enter the final temperature in Fahrenheit: ");
        double fah2 = sc.nextDouble();
        double cel1 = (fah - 32)/1.8;
        double cel2 = (fah2 -32)/1.8;
        
        double Q = M*(cel2 - cel1)*4184;
        
        System.out.printf("The energy needed is: %.6e\n",Q);
        sc.close();
        
    }
    
}

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
public class L2Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of the car: ");
        double P = sc.nextDouble();
        System.out.println("Enter the down payment: ");
        double D = sc.nextDouble();
        System.out.println("Enter the interest rate(%): ");
        double R = sc.nextDouble();
        System.out.println("Enter thee loan year: ");
        int Y = sc.nextInt();
        if(D>P||D<0||P<0||R<0||Y<0){
            System.out.println("Invalid input.");
        }else{
            double M = (P-D)*(1+R*Y/100)/(Y*12);
            System.out.printf("The monthly payment is: %.2f\n",M);
        }
        sc.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LAB2;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class L2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        double fah = sc.nextDouble();
        double cel = (fah - 32)/1.8;
        System.out.printf("The temperature in Celsius: %.2f\n",cel);
        sc.close();
    }
    
}

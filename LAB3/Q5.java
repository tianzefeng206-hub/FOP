/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB3;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Q5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num a:");
        double a = sc.nextDouble();
        System.out.println("Enter the num b:");
        double b = sc.nextDouble();
        System.out.println("Enter the num c:");
        double c = sc.nextDouble();
        System.out.println("Enter the num d:");
        double d = sc.nextDouble();
        System.out.println("Enter the num e:");
        double e = sc.nextDouble();
        System.out.println("Enter the num f:");
        double f = sc.nextDouble();
        double mini = 0.0000001;
        if(a*d-b*c>mini){
            double x = (e*d-b*f)/(a*d-b*c);
            double y = (a*f-e*c)/(a*d-b*c);
            System.out.println("X value: " +x);
            System.out.println("Y value: " +y);
        }else{
            System.out.println("The equation has no solution");
        }
        sc.close();
    }
}

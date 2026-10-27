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
public class Q6 {
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = sc.nextDouble();
        System.out.println("Enter the x for coordinate: ");
        double x = sc.nextDouble();
        System.out.println("Enter the y for coordinate: ");
        double y = sc.nextDouble();
       
        if(x*x+y*y> radius*radius){
            System.out.println("The coordinate is outside the circle");
        }else if(x*x+y*y== radius*radius){
            System.out.println("The coordinate is on the edge of the circle");
        }else{
            System.out.println("The coordinate is inside the circle");
        }
        sc.close();
    }
}

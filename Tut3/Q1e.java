/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tut3;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Q1e {
    public static void main(String [] args){
        System.out.println("Enter an integer from 0 to 6");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch(num){
            case 0-> System.out.println("Monday");
            case 1-> System.out.println("Tuesday");
            case 2-> System.out.println("Wedensday");
            case 3-> System.out.println("Thursday");
            case 4-> System.out.println("Friday");
            case 5-> System.out.println("Saturday");
            case 6-> System.out.println("Sunday");
           
        }
        sc.close();
    }
}

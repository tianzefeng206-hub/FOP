/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tut4;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Q1d {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int i = sc.nextInt();
        int sum=0;
        for(int j =1 ; j<=i;j++){
            sum+=j;    
    }
        System.out.println("The sum from 1 to the number : "+sum); 
        sc.close();
}
}

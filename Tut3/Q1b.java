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
public class Q1b {
   public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter an Integer:");
       int num = sc.nextInt();
       if(num%2==0){
           System.out.println("It's even");
       }else{
           System.out.println("It's odd");
       }
       sc.close();
   }
}

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
public class Q4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one line:");
        String input = sc.nextLine();
        for(int i = input.length()-1;i>=0;i--){
             System.out.print(input.charAt(i));
        }
        sc.close();
    }
}

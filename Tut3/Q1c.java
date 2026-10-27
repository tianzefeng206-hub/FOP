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
public class Q1c {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        if(ch>='A'&&ch<='Z'){
            System.out.println("It's capital");
        }else{
            System.out.println("It's not capital");
        }
        sc.close();
    }
}

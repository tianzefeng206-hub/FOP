/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB4;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer to get the factors: ");
        int num = sc.nextInt();
        for(int i = num; i>=1;i--){
            
                if(num%i==0){
                    System.out.print((num/i)+" ");
                }
            }
        }
    }


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tut4;

/**
 *
 * @author Lenovo
 */
public class Q1e {
    public static void main(String [] args){
        int i = 25;
        int j = 1;
        double sum = 0;
        while(i>=1&&j<=25){
            sum+=(double)j/i;
            i--;
            j++;
        }
        System.out.printf("The sum is : %.2f%n",sum);
    }
}

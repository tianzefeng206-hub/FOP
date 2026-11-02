/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tut4;
import java.util.Random;
/**
 *
 * @author Lenovo
 */
public class Q1c {
    public static void main(String[] args){
        Random rand = new Random();
        for(int i=1;i<=4;i++){
            for(int j = 1;j<=5;j++){
                System.out.print(rand.nextInt(101)+" ");
            }
            System.out.println();
        }
    }
}

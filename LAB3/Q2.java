/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB3;
import java.util.Random;
/**
 *
 * @author Lenovo
 */
public class Q2 {
    public static void main(String[]args){
        Random rand = new Random();
       int num = rand.nextInt(6);
        if(num==0){
            System.out.println("0=zero");
        }else if(num==1){
            System.out.println("1=one");
        }else if(num==2){
            System.out.println("2=two");
        }else if(num==3){
            System.out.println("3=three");
        }else if(num==4){
            System.out.println("4=four");
        }else if(num==5){
            System.out.println("5=five");
        }
    }
}

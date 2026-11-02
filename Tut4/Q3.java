/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tut4;

/**
 *
 * @author Lenovo
 */
public class Q3 {
    public static void main(String[]args){
        int temp_1=1;
        int temp_2=1;
        int temp_3;
        System.out.println("f1 = "+temp_1);
        System.out.println("f2 = "+temp_2);
        for(int i = 3;i<=10;i++){
           temp_3=temp_1+temp_2;
           temp_1=temp_2;
           temp_2=temp_3;
            System.out.println("f"+i+" = "+temp_3);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB3;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Q1 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the secod number:");
        int num2 = sc.nextInt();
        System.out.println("Enter the operand(+,-,*,/):");
        char op = sc.next().charAt(0);
        float re;
        if(num2!=0){
        if(op=='+'){
            re = num1 + num2;
            System.out.println("Result: "+ re);
        }else if(op=='-'){
        re=num1- num2;
        System.out.println("Result: "+ re);
    }else if(op=='*'){
        re=num1*num2;
        System.out.println("Result: "+ re);
    }else if(op=='/'){
        re=(float)num1/num2;
        System.out.println("Result: "+ re);
    }else if(num1==0){
        re=0;
        System.out.println("Result: "+ re);
    }
    else{
            System.out.println("Invaild");
    }
        
        
    }else{
            System.out.println("Invaild");
        }
        sc.close();
    }
}

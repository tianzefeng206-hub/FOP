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
public class Q3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sales: ");
        int sale = sc.nextInt();
        double com;
        if(sale>0){
            if(sale<=100){
                com=sale*0.05;    
                System.out.printf("The commission is : %.2f%n",com);
            }else if(sale<=500){
                com=sale*0.075;     
                System.out.printf("The commission is : %.2f%n",com);
            }else if(sale<=1000){
                com=sale*0.1;
                System.out.printf("The commission is : %.2f%n",com);
            }else{
                com=sale*0.125;
                System.out.printf("The commission is : %.2f%n",com);
            }
        }else{
            System.out.println("Invalid sales");
        }
        
        sc.close();
    }
}

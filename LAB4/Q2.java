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
public class Q2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int n = sc.nextInt();
        int sum=0;
        
        for(int i= 1; i<=n ; i++){
            for(int j = 1;j<=i;j++){
                sum+=j;
            }
        
    }
        System.out.println("The result is: "+sum);
        sc.close();
    }
}

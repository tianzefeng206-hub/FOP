/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2;
import java.util.Random;
/**
 *
 * @author Lenovo
 */
public class L2Q5 {
    public static void main(String [] args){
        Random rand = new Random();
        int Num = rand.nextInt(0,10001);
        int temp = Num;
        int sum = 0;
        if(Num==0){
            sum=0;
        }else{
            while(temp>0){
                int digit = temp%10;
                sum += digit;
                temp/=10;
            }
        }
        System.out.println("The random number is: "+ Num);
        System.out.println("The sum of every digit of the number is: "+ sum);
    }
}

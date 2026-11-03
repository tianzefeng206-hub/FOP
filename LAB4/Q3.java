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
public class Q3 {
   public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       int score = 0;   
       int sum = 0;
       int sumD= 0;
       int i = 0;
       int mini = 9999;
       int max = 0;
       while(score>=0){
           System.out.println("Enter a score(negative score to quit):");
           score = sc.nextInt();
         if(score>=0){
             sum+=score;
             sumD+=score*score;
             i++;
             if(score>=max){
                 max=score;
             }
             if(score<=mini){
                 mini=score;
             }
         }
         
       }
       
       double avg = sum/i;
       double std = Math.sqrt((sumD-sum*sum/i)/(i-1));
       System.out.println("Minimum score: "+mini);
       System.out.println("Maximum score: "+max);
       System.out.printf("Average score: %.2f%n",avg);
       System.out.printf("Standard deciation: %.2f%n",std);
   } 
}

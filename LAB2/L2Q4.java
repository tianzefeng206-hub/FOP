/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class L2Q4 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time in seconds: ");
        int sec = sc.nextInt();
        int hour = sec/3600;
        int remainSec1 = sec%3600;
        int min = remainSec1/60;
        int remainSec2 = remainSec1%60;
        System.out.println(sec+ "seconds is " +hour+"hours " +min+ "minutes and " +remainSec2+ "seconds.");
        sc.close();
    }
    
}

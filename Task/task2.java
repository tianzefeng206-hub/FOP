/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task;
import java.util.*;
/**
 *
 * @author fawwa
 */
public class task2 {
    
    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);
        
       
        int[][] cord = new int[3][2];
        
        for( int i=0 ; i < 3 ; i++ ){
           
                System.out.print("ENTER COORDINATE FOR "+i+1+"X : ");
                cord[i][0] = in.nextInt();
                System.out.print("ENTER COORDINATE FOR "+i+1+"Y : ");
                cord[i][1] = in.nextInt();
           
        }

        int slope1,slope2;
                   
                   slope1 = (cord[1][1] - cord[0][1]) * (cord[2][0] - cord[0][0]);
                   slope2 = (cord[2][1] - cord[0][1]) * (cord[1][0] - cord[0][0]);
                   
                   if (slope1 == slope2 ) {
                       System.out.println("OUTPUT : FALSE");
                   } else {
                       System.out.println("OUTPUT : TRUE");
                   }
                   in.close();
               }

        
    }
    



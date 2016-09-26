/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// To decide a prime number, we should divide the number by 2, then 3, then 4 
// ... to squareroot of this number.
package primenumber;

/**
 *
 * @author apple1
 */
import java.util.*;
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean b = true;
        if(a%2 == 0){System.out.println(a + " is not a prime number");}
        for(int i = 3;i<Math.sqrt(a);i+=2){
        if(a%i==0) 
        {System.out.println(a+" is not a prime number");
        b = false;
        }
        
        }
        if(b) System.out.println(a+" is a prime number");
    }
    
}

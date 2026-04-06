package reversethenumberofenterd;

import java.util.*;
import java.util.Scanner;

public class ReverseTheNumberOfenterd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the length your array");
        int num = input.nextInt();
        System.out.println("enter the numbers of an array");
        int [] numbers = new int[num];
        for(int i=0;i<numbers.length;i++){
            
            numbers[i] = input.nextInt();
     
        }
        
        System.out.println("the orignal array is ");
      
        for(int j =0;j<numbers.length;j++){
           System.out.print(numbers[j]);
       }
        int[] newNumber = new int[numbers.length];
        int j = numbers.length-1;
        for(int i=0;i<numbers.length;i++){
            newNumber[j] = numbers[i];
            j--;
        }
        
        System.out.println("");
        System.out.println("the reverse array is ");
        for(int i=0;i<numbers.length;i++){
            System.out.print(newNumber[i]+" ");
        }
        
        
       



    }
    
}

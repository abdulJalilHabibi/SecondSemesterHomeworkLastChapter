package distictnumebr;

import java.util.Scanner;

public class DistictNumebr {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 10 numbers: ");
        int[] num = new int[10];
        int[] distictNumber = new int[10]; 
        
        
        for(int i =0;i<num.length;i++){  
            num[i] = input.nextInt();
           }
        int count = 0;
        
        for(int i=0;i<num.length;i++){
        boolean isDistinct = true;

            for(int j=1;j<count;j++){
                if(num[i]==distictNumber[j]){
                    isDistinct = false;
                    break;
                }
              
                    
            }
          if(isDistinct){
            distictNumber[count] = num[i];
            count++;
          }
      
        }
        
        System.out.println("the number of distinct is " + count);
        System.out.print("the Distinct Number are:");
        for(int i = 0; i<count;i++){
            System.out.print(distictNumber[i]+" ");
        }
        
        
        
        




    }
    
}

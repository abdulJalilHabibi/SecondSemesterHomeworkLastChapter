package analyzescore;

import java.util.Scanner;

public class AnalyzeScore {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
         int[] scores = new int[100];
         int x = 0; 
         int sum = 0;
         while(true){
        System.out.println("enter the score of student and negative number to finsihed the input");
            int score = input.nextInt();
            if(score<0){
                break;
            }
            if(x==100){
                break;
            }
            scores[x] = score;
            x++;
        }

        int IncreamentCount = 0;
        int decareamentCount = 0;
        for(int i = 0;i<x;i++){
            sum+=scores[i];
        }
       
       double avg = (sum)/x;
        for(int i=0;i<x;i++){
            
            if(scores[i]>=avg){
                IncreamentCount++;
            }
            else{
                decareamentCount++;
            }
        
        }
        
        System.out.println("numebr of score greather then average is " + IncreamentCount);
        System.out.println("numebr of score less then average is " + decareamentCount);
        
        
}
}

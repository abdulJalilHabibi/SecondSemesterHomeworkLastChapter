
package assign.grades;

import java.util.Scanner;

public class AssignGrades {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("enter the number of students");
            int numStudent = input.nextInt();
            
            int[] studentScore = new int[numStudent];
            
            System.out.println("enter the students socre");
            for(int i=0;i<studentScore.length;i++){
                studentScore[i] = input.nextInt();
            }
            int max = studentScore[0];
            for(int i=0;i<studentScore.length;i++){
                
                if(studentScore[i]>max){
                    max = studentScore[i];
                }
                
            }
            
            for(int i=0;i<studentScore.length;i++){
            
                if(studentScore[i] >= max-10){
                    System.out.println("student "+i+" score is "+studentScore[i]+" and grade is A");
                }
                else if(studentScore[i] >= max-20){
                 System.out.println("student "+i+" score is "+studentScore[i]+" and grade is B");
                }
                
                else if(studentScore[i] >= max-30){
                 System.out.println("student "+i+" score is "+studentScore[i]+" and grade is C");
                }
                
                else if(studentScore[i] >= max-40){
                 System.out.println("student "+i+" score is "+studentScore[i]+" and grade is D");
                }
                
                else{
                    System.out.println("your Grade is F");
            }
                
            }
            
            
            
            
            
            
            
            


    }
    
}

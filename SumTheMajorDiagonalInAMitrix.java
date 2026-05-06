package sumthe.majordiagonal.in.a.mitrix;

import java.util.Scanner;

public class SumTheMajorDiagonalInAMitrix {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 4-by-4 matrix");
        double [][] matrix = new double[4][4];
        
        for(int i=0;i<4;i++){
             System.out.print("Enter row " + (i + 1) + ": ");
             String line = input.nextLine();
             String[] number = line.split(" ");
             
            for(int j=0;j<4;j++){
                matrix[i][j] = Double.parseDouble(number[j]);
            }
        }
        
        double result = sumMajorDiagonal(matrix);
        System.out.println("the diagonal SUM is " + result);
        
        
    }
    
    
    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;
        
        for(int i=0;i<m.length;i++){
            sum+=m[i][i];
        }
        return sum;
    
    }
}

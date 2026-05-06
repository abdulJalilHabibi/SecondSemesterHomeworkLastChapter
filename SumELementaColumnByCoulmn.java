package sumelementacolumnbycoulmn;

import java.util.Scanner;

public class SumELementaColumnByCoulmn {

    public static void main(String[] args) {
            
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][4];
        
        System.out.println("Enter a 3-by-4 matrix row by row");
        
            for(int i=0;i<3;i++){
                for(int j=0;j<4;j++){
                    matrix[i][j] = input.nextDouble();
                }
            }
            for(int i=0;i<4;i++){
               double sum = sumColumn(matrix, i);
                   
                System.out.println("sum of Column "+i+" is "+ sum);    
                   
            }
        
    }
    public static double sumColumn(double[][] m, int columnIndex){
        
        double sum = 0;
        for(int i=0;i<m.length;i++){
            sum += m[i][columnIndex];
        }
        
        
        return sum;
    }
}

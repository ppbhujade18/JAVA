import java.util.*;
/* 
public class spiral{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no. rows");
        int m = sc.nextInt();
        System.out.println("Enter no. Columns");
        int n = sc.nextInt();
        int [][] matrix = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.err.println("The Spiral Order Matrix is : ");
        int rows = 0;
        int rowe = m-1;
        int cols = 0;
        int cole = n-1;

        while (rows <= rowe && cols <= cole) {

            for(int col = cols; col <= cole;col++){
                System.out.print(matrix[rows][col] + " ");

            }
            rows++;

            for(int row = rows; row<=rowe;row++){
                System.out.print(matrix[row][cole] +" ");
            }
            cole--;
            for(int col = cole;col >= cols;col--){
                System.out.print( matrix[rowe][col] +" ");
            }
            rowe--;
            for(int row = rowe; row >= rows;row--){
                System.out.print(matrix[row][cols] +" ");
            }
            cols++;

            System.out.println();
       }
        
    }
}
    */
public class spiral {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int m = sc.nextInt();
        System.out.println("Enter number of columns");
        int n = sc.nextInt();

        int [][] matrix = new int[m][n];
        System.out.println("Enter numbers in the matrix ");

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();

            }   
        }

        for(int j=0;j<n;j++){
            for(int i=0;i<m;i++){
                
                System.out.print(matrix[i][j] + " ");

            } 
            System.out.println();  
        }
    }
}
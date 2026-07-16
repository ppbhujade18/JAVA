import java.util.*;
/*
public class TwoDarr {
    // take amatrix and print its element

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Row :");
        int row = sc.nextInt();
        System.out.println("Columns :");
        int col =sc.nextInt();

        int[][] matrix = new int[row][col];
        //input
        System.out.println("write elements in matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix [i][j] = sc.nextInt();
            }
        }

        // output print
        System.out.println("Elements in the matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    
}
*/
public class TwoDarr{
    // Searching for an element x in a matrix.

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Row :");
        int row = sc.nextInt(); 

        System.out.println("Column :");
        int col = sc.nextInt();

        int [][] matrix = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix [i][j] = sc.nextInt();

            }
        }
        System.out.println("Which number you want to find ?");
        int x = sc.nextInt();

        for(int i=0; i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j] == x){
                    System.out.print("x found at location"+"(" + i +","+ j + ")");
                }
            }
        }

    }

}   
    

/*
import java.util.*;


public class Arrays {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();


      int matrix[][] = new int[n][m];
      for(int i=0; i<n; i++) {
           for(int j=0; j<m; j++) {
               matrix[i][j] = sc.nextInt();
           }
      }


      System.out.println("The Spiral Order Matrix is : ");
      int rowStart = 0;
      int rowEnd = n-1;
      int colStart = 0;
      int colEnd = m-1;


      //To print spiral order matrix
      while(rowStart <= rowEnd && colStart <= colEnd) {
          //1
          for(int col=colStart; col<=colEnd; col++) {
              System.out.print(matrix[rowStart][col] + " ");
          }
          rowStart++;


          //2
          for(int row=rowStart; row<=rowEnd; row++) {
              System.out.print(matrix[row][colEnd] +" ");
          }
          colEnd--;


          //3
          for(int col=colEnd; col>=colStart; col--) {
              System.out.print(matrix[rowEnd][col] + " ");
          }
          rowEnd--;


          //4
          for(int row=rowEnd; row>=rowStart; row--) {
              System.out.print(matrix[row][colStart] + " ");
          }
          colStart++;


          System.out.println();
      }
   }
}

*/


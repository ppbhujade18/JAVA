import java.util.*;
/*
// star pattern 
public class loop{
    public static void main(String args[]){
        for(int l= 1; l<=4;l++){
            for(int j=1;j<=l;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
*/

/* 
public class pattern {
    public static void main(String args[]){
        int n = 4;
        for(int l=1;l<=n;l++){
            for(int j=1;j <= (n-l)+ 1; j++ ){ // REVERSE PATTERN FOR STAR PATTERN
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
    
}
*/
//HALF PYRAMID PATTERN 
/* 
public class pattern{
    public static void main(String args[]){
        for(int l=1;l<=4;l++){
            for(int n=1;n<=l;n++){
                System.out.print(n);

            }
            System.out.println(" ");
        }
    }
}


// character pyramid

public class pattern{
    public static void main(String args []){
        int n =4;
        char ch = 'A';

        for(int l= 1;l<=n;l++){

            for(int c=1 ;c<=l;c++){

                System.out.print(ch);
                ch++;
            }
            System.out.println();

        }
    }
}
*/

// hollow rectangle

public class pattern{

    public static void hollow_rect(int totrow, int totcol){
        for(int i=1; i<=totrow;i++){
            for(int j=1 ; j<=totcol;j++){
                if(i==1 || i == totrow || j==1 || j == totcol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }

    public static void inv_pyramid(int n){
        for(int i = 1; i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");  //for spaces
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");  //for stars

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //hollow_rect(4, 5);
        inv_pyramid(6);
    }
}
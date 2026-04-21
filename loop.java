import java.util.*;

/*   // printing hello world 100 times using while loop
public class loop {
    public static void main(String args[]){

        int count = 0;

        while (count < 100) {
            System.out.println("Hello World");

            count++;
        }

    }
}
*/
// print number upto n
/* 
public class loop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE RANGE");

        int range = sc.nextInt();
        int count = 1;

        while(count <= range){

            System.out.println(count + " ");
            
            count ++;

        }
    }
}
*/
// for loop
/* public class loop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE RANGE");

        int n = sc.nextInt();                  // print numbers upto n natural number

        for(int i =1; i<=n; i++){

            System.out.println(i);
            
           

        }
    }
}
    */
// print square pattern 
/*
public class loop{
    public static void main(String args[]){

        for(int l = 1; l<=6;l++){
            System.out.println("******");
        }

    }
}
*/
// print sum of n natural number
/* 
public class loop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER n ");
        int n = sc.nextInt();

        int sum = 0;
        int i =1;
        
        while(i<=n){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum = " + sum );
    }
}
*/
// do while loop eg.  hello world 5 times
/*
public class loop{
    public static void main(String args[]){
        int i =1 ;
        do{                                                //eg.  hello world 5 times

            System.out.println("Hello World");
            i++;

        }while(i<=5);
    }
}
*/
/* 
public class loop{
    public static void main(String args[]){     /// writing code for reverse numbers
        int n =10899;
        while(n>0){
            int lastdigit = n%10;
            System.out.print(lastdigit);
            n = n/10;

        }

    }
}
*/
// continue statement - to Skip iteration 
/*public class loop{
    public static void main(String args[]){
        for(int i =1;i<=6;i++){
            if(i == 3){
                continue;

            }
            System.out.println(i);
        }

        Scanner sc = new Scanner(System.in);
        /* 
        do{
            System.out.println("ENTER YOUR NUMBER");
            int n = sc.nextInt();/// skipping number divisible  by 10
            if(n%10 == 0){
                continue;
            }
            System.out.println("YOUR NUMBER WAS " + n);
        }while(true); 

        do{
            System.out.println("ENTER YOUR NUMBER");
            int n = sc.nextInt();
            if(n % 10 == 0){ // using break statement break the loop when number is divisible by 10 
                break;
            }
            System.out.println("YOUR NUMBER WAS " + n);
        }while(true);
    }
}
*/ 
// eg. given an intger n and sum of digits
/* 
public class loop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER");
        int n = sc.nextInt();
        int sum =0;

        while(n>0){
            int lastdigit = n%10;
            sum = sum + lastdigit;
            n =n/10;

        }
        System.out.println(sum);

    }
}
*/
/* 
public class loop{
    public static void hollow_rect(int tr ,int tc ){
        for(int i=1;i<=tr;i++){
            for(int j=1;j<=tc;j++){

                if(i==1 || i==tr || j==1 || j==tc){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        
    }

    public static void main(String args[]){
        hollow_rect(5,8);
       
    }
}


public class loop{
    public static void main(String args[]){
        int n = 4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            
            System.out.println();
        
        }
    }
}


public class loop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER FOR INVERTED HALF PYRAMID ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        
        }
    }
}
*/
public class loop{
    public static void floyd(int n){
        int count = 1; 
        for(int i=1;i<= n;i++){
            for(int j=1;j<=i;j++){

                System.out.print(count+ " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void ZO_triangle(int n){
         
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j) % 2 == 0 ){
                    System.out.print("1");

                }
                else{
                    System.out.print("0");
                }
                
            }
            System.out.println();
        }

    }

    public static void main(String args[]){
        //floyd(5);
        ZO_triangle(5);
    }
}
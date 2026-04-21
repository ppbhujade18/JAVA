import java.util.*;

public class conditions {
    public static void main(String args[]){
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        int A = sc.nextInt();
        System.out.println("Enter B");
        int B =sc.nextInt();
        System.out.println("Enter C");
        int C =sc.nextInt();

        if((A>=B) && (A>=C)){
            System.out.println("A is big");
        }
        else if(B>=C){
            System.out.println("B is big");
        }
        else{
            System.out.println("C is big");
        }
           
        //ternary operator
        int marks = 32;
         
        String result = (marks>=33) ? "pass" : "fail";
        System.out.println(result);
        */

        // calculator using switch case
        
    Scanner sc = new Scanner(System.in);
    
    System.out.println("ENTER A ");
    int a = sc.nextInt();

    System.out.println("ENTER B ");
    int b = sc.nextInt();

    System.out.println("Which operation you want to perform ");
    System.out.println("1.ADDITION");
    System.out.println("2.SUBTRACTION");
    System.out.println("3.DIVISION ");
    System.out.println("4.MULTIPLICATION ");
    System.out.println("5. REMAINDER");

    int ops = sc.nextInt();

    switch (ops) {
        case 1 : System.out.println(a + b);
            
            break;

        case 2 : System.out.println(a - b);
            break;
        case 3 : System.out.println(a/b);
           break;
        case 4 : System.out.println(a*b);
          break;
        case 5 :System.out.println(a%b);
          break;
            
        default: System.out.println("INVALID OPTION");
            break;
    }




    }

    
}

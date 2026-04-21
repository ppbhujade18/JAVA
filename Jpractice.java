import java.util.*;

public class Jpractice {
   public static void main(String args[]){

      /*Scanner sc = new Scanner(System.in);
      System.out.println("Enter Num1");

      int num1= sc.nextInt();
      
      System.out.println("Enter Num2");

      int num2= sc.nextInt();

     
      if(num1>num2){
        System.out.println("num1 is greater");
      }

      else if(num2>num1){
         System.out.println("num2 is greater");
      }
      else{
         System.out.println("num1 and num2 are equal");
      } */
     Scanner sc = new Scanner(System.in);  // income tax calculator
     System.out.println("Enter Income ");
     
     int income = sc.nextInt();
     int tax = 0;
     
     if(income<500000){
      tax=0;

     }
      
     else if(income>=500000 && income<1000000){
      tax =(int) (income*0.2);

     }
     else{
      tax = (int) (income * 0.3);
   
     }
     System.out.println("Your Tax slab is " + tax);
   }
}

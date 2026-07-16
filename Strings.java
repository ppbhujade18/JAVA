import java.util.*;


//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
/* 
public class Strings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=0;
        System.out.println("how many strings you want to add?");
        int size = sc.nextInt();


        String [] arrayStr = new String[20];
        System.out.println("Enter Strings");

        for(int i=0 ; i<size;i++){
            arrayStr[i]= sc.next();
            total += arrayStr[i].length();
        }
        System.out.println("total length of all strings");
        System.out.println(total);
        
    }
}
*/
//replace 'i' instead of 'e' in string;
/* 
public class Strings{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";

        for (int i=0;i<str.length();i++){
            if(str.charAt(i) == 'e'){
                result += 'i';
            }else{
                result += str.charAt(i);
            }
        }
        System.out.println("Result string :" + result);
    }
}
*/
/* //create username using email id  
public class Strings{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String username = "";
        System.out.println("Enter email id ");
        String email =sc.next();

        for(int i=0;i<email.length();i++){

            if(email.charAt(i) == '@'){
                break;
            }else{
                username += email.charAt(i);
            }
        }
        System.out.println(username);
    }
}
*/
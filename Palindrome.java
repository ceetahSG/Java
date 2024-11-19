import java.util.Scanner;
public class Palindrome {
    public static void checker(int a){
        int temp = a;
        int reversed = 0;
        while(a>0){
            int remainder = a%10;
            reversed = (reversed*10)+remainder;
            a= a/10;
             
        }
        if(reversed == temp){
            System.out.println("Palindrome");
            
        }
        else{
            System.out.println("Not Palindrome");
           
        }
    }
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x;
        System.out.println("Enter your value:");
        x = s.nextInt();
        checker(x);
        
        
       
    }
}

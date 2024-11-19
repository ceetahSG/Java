import java.util.Scanner;

public class RevereseString {
    public static String reverse(String input){
        StringBuilder reversed = new StringBuilder();
        for(int i = input.length() - 1;i>=0;i--){
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
        
        
        

}
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String userInput;
        System.out.println("Enter your string:");
        userInput = s.nextLine();
        String reversed = reverse(userInput);
        System.out.println(reversed);
    }
    
}

import java.util.Scanner; //import Scanner
//main method
public class palindromeMain {
    public static void main (String[] args){
        //Creates object of palindromeChecker Class
        palindromeChecker obj1 = new palindromeChecker();
        //Initialize Scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word to see if it is a palindrome: ");
        //Sets word = to what user typed
        String word = input.nextLine();
        //Run method
        System.out.println(obj1.palindromeCheckers(word));
    }
    
}

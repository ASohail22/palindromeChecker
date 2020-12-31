/*
    Checks to see if word forwards and reversed is same
    @param word The String that the user enters
    @return True if palindrome, else return false
*/
public class palindromeChecker{
public boolean palindromeCheckers(String word){

    for(int x = 0; x<word.length(); x++){
        //checks to see if the letters forward and backwards are the same
        if(word.toLowerCase().charAt(x) != word.toLowerCase().charAt(word.length()-1-x)){
            return false;
        }
    }
    return true;
}
}

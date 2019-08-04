package nums;

public class Palindrome {
    public boolean isPalindrome(int x){
        StringBuffer conv=new StringBuffer();
        conv.append(x);
        if (conv.reverse().toString().equals(String.valueOf(x)))
            return true;
        return false;
    }
}

// finding whether the given string is palindrome or not using recursion
import java.util.*;  
class Program5
{
    static boolean isPalindrome(String str,int start,int end)
    {
        if(start == end)
            return true;
        if((str.charAt(start)) != (str.charAt(end)))
            return false;
     if (start < end )
            return isPalindrome(str, start + 1, end - 1);
  
        return true;
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.next();
        int n = str.length();
        if(isPalindrome(str,0,n-1))
        System.out.println("The given string is a plaindrome");
        else
         System.out.println("The given string is not a plaindrome");
        
    }
}
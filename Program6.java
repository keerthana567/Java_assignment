// sorting string
import java.util.*;
class Program6
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings");
        int count = sc.nextInt();
  String [] str = new String[count];
          System.out.println("Enter the Strings :");
        for(int i = 0; i < count; i++)
        {
            // sc.next() takes input till the space 
            //str[i] = sc.nextLine();
            str[i] = sc.next();
        }
        Arrays.sort(str);
         System.out.println("Sorted Strings: ");
        for (int i = 0; i < count; i++) {
            System.out.println(str[i]);
        }

    }
}
// Time complexity:O(n logn) for inbuilt sorting 
// Sorting string in ascending order
import java.util.*;
class Program6_1
{
    void Sorting (String str[])
    {
         String temp;
         int n = str.length;
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (str[i].compareTo(str[j]) > 0) 
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
    }
  public static void main(String args[])
    {
        Program6_1 obj = new Program6_1();
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
          obj.Sorting(str);
         System.out.println("Sorted Strings: ");
        for (int i = 0; i < count; i++) 
        {
            System.out.println(str[i]);
        }

    }
}
//Time complexity: o(n^2) //bubble sort
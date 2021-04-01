// Example for getting values from user
import java.util.*;
class Program4_1
{
     public int nextInt()
    {
         System.out.println("enter the number of digit to sort :");
                Scanner sc = new Scanner(System.in);
                int n=sc.nextInt();
                int arr[] = new int[n];
                         System.out.println("enter the numbers to sort :");

                for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
                System.out.println("Sorted order:");
                Arrays.sort(arr);
                for(int i=0;i<n;i++)
                System.out.println(arr[i]);
                return 0;

    }
    
    public static void main(String args[])
    {
        Program4_1 obj=new Program4_1();
        obj.nextInt();
    }
}
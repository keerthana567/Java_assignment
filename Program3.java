// binary search
import java.util.*;
class Program3
{
    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
     public static void main(String args[])
    {
       Program3 ob = new Program3();
       Scanner sc = new Scanner(System.in);
               System.out.println("Enter the no of values:");
       int n = sc.nextInt();
        int arr[] =new int[n];
        System.out.println("Enter the values:");
       for(int itr=0;itr<n;itr++)
        {
        arr[itr]=sc.nextInt();
        }
       System.out.println("Enter the target value to be found: ");
         int target =sc.nextInt();
        int result = ob.binarySearch(arr, 0, n - 1, target);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
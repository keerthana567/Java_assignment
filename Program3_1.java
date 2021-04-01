//problem using BINARY SEARCH algothrm and subsequence and 
import java.util.*;
class Program3_1
{
     public void maxEnvelopes(int[][] envelopes) 
     {
        Arrays.sort(envelopes,(a,b) ->a[0]==b[0]?b[1]-a[1]:a[0]-b[0]);
        int [] dp = new int[envelopes.length];
        int max=0;
        for(int i=0;i<dp.length;i++)
        {
            int index=binarySearch(dp,0,max,envelopes[i][1]);
            dp[index]=envelopes[i][1];
            if(index==max)
                max++;
        }
        System.out.println("The maximum of envelopes shared: "+max);
    }
    //inbuilt search
    int binarySearch(int[] arr,int start,int end,int target)
    {
        int index=Arrays.binarySearch(arr,start,end,target);
        if(index<0)
        {
            index =-(index+1);
        }
        return index;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        Program3_1 obj= new Program3_1();
        System.out.println("Enter the number of Envelopes:");
        int n=sc.nextInt();
        int[][] arr =new int[n][2];
       System.out.println("Enter the width and height of the envelopes:");
        for(int itr=0;itr<n;itr++)
        {
            for(int itr1=0;itr1<2;itr1++)
            {
                arr[itr][itr1]=sc.nextInt(); 
            }
        }
        obj.maxEnvelopes(arr);
        
    }
}
//Time complexity:o(nlogn)
//finding grade of the student by user input

import java.util.Scanner;  
class Program1
{
    static   char average(int total,int max)
    {
        double percentage =((double)(total)/ max) * 100;
        char grade ='D';
        if(percentage >= 80)
        {
            return grade='A';
        }
        else if(percentage >= 60 && percentage < 80)
        {
            return grade='B';
        }
        else if(percentage >= 40 && percentage < 60)
        {
            return grade='C';
        }
        return grade;
        
        
    }
    public static void main(String args[])
    {
      System.out.print("Enter total number of subjects:\n"); 
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();  
         int [] marks = new int[n];
         int total=0,max_mark=n*100;
         
       System.out.print("Enter the obtain marks in the subject:\n"); 

             for(int itr=0;itr<n;itr++)
        {
                marks[itr]=sc.nextInt();
                total+=marks[itr];
        }
       char grade = average(total,max_mark);
            System.out.println("Grade of the student :" + grade); 
    }
}
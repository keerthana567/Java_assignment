 import java.util.Scanner;

  class NegativeNumberException extends Exception 
   {
      public NegativeNumberException()
      {
    super();
     }
  public NegativeNumberException(String msg)
  {
    super(msg);
  }
}
 class Addition 
{

  public static int add(int a, int b) 
       throws NegativeNumberException 
       {
         if(a<0 || b<0) 
        throw new NegativeNumberException(
                 "Pass only +ve number");
    return a+b;

  } 
} 
 public class Program7 {

   public static void main(String[] args) {
     int a = 0, b = 0;
     Scanner scan = new Scanner(System.in);
     System.out.print("Enter first number: ");
     a = scan.nextInt();
     System.out.print("Enter second number: ");
     b = scan.nextInt();
     Program7 obj =new Program7();
     try {
       int sum = Addition.add(a, b);
       System.out.println("Sum = " + sum);
     } catch(NegativeNumberException e) {
       System.out.println(e.getMessage());
     }
   }
}
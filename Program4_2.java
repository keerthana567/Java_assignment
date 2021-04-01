// Example for getting values from user public float nextFloat()
import java.util.*;
class Program4_2
{
    public static void main(String[] args)throws Exception
    {
      try 
      {
         String s = "Keerthana 9 + 6 = 12.0";
            Scanner scanner = new Scanner(s);
  
            while (scanner.hasNext()) 
            {
                 System.out.println("Next Float value :"
                                   + scanner.nextFloat());
            }
        }
        catch (Exception e) 
        {
            System.out.println("Exception thrown: " + e);
        }
    }
}
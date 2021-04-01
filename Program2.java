// Finding area of shapes using method overloading

class Program2
{
   static final double PI =Math.PI;
   void Area(float val)
   {
        float area = val*val;
        System.out.println("Area of the Square: "+ area);
   }
    void Area(int length, int breadth)
    {
        int area = length * breadth;
        System.out.println("Area of the Rectangle: " + area);
    }
     void Area(double val)
    {
        double area = PI * val * val;
        System.out.println("Area of the Circle: " + area);
    }
        public static void main(String args[])
        {
            Program2 obj = new Program2();
             obj.Area(6);
            obj.Area(6,5);
            obj.Area(5, 4);
        }
    }

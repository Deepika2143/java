import java.util.*;
public class circumf
{
       public static double cirOfCircle(double rad)
       {
              return 2*3.14*rad;
       }
      public static void main(String args[])
      {
            float rad;
            System.out.print("Enter Your Radius : ");
            Scanner sc  = new Scanner(System.in);
            rad = sc.nextFloat();
             System.out.println(cirOfCircle(rad));         
      }
 }



















































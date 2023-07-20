import java.util.*;
public class OddNum1ton
{
      public static void OddNum(int n)
      {
            for(int i =1;i<n;i = i+2)
              {      System.out.print(i);
                     System.out.print("  ");
              }
       }
      public static void main(String args[])
      {
             int n;
             System.out.print("Enter Your Size : ");
             Scanner sc = new Scanner(System.in);
             n = sc.nextInt();
             OddNum(n);
      }
}












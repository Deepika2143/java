import java.util.*;
public class greatest2
{
         public static int great(int n1,int n2)
         {
                 if(n1>n2)     return n1;
                 else     return n2;
         }
         public static  void main(String args[])
         {
               System.out.println("Enter Your Two Numbers : ");
               Scanner sc  = new Scanner(System.in);
               int n1 = sc.nextInt();
               int n2 = sc.nextInt();
               System.out.println(great(n1,n2));
         }
}























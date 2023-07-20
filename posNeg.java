import java.util.*;
public class posNeg
{
      public static void status(int arr[],int size)
      {
               int zeros = 0,pos = 0,neg = 0;
              for(int i  = 0;i<size ;i++)
              {
                   if(arr[i] == 0)     zeros++;
                   else if(arr[i] > 0)    pos++;
                   else       neg++;
              }
              System.out.println("Zeros  : " +zeros);
              System.out.println("Positive Numbers  :  "+pos);
              System.out.println("Negative Numbers  : "+neg);
      }
      public static void main(String args[])
      {
         System.out.print("Enter Your No.Of Elements : ");
         Scanner sc = new Scanner(System.in);
         int size = sc.nextInt();
         int arr []= new int[size];
         System.out.println("Enter Your Elements :");
         for(int i =0;i<size;i++)
               arr[i] = sc.nextInt();
          status(arr,size);
      } 
}











import java.util.*;
public class fibonacci
{
        public static void fib(int lim)
        {
              int first = 0,second = 1,temp;
              if(lim >=0)    System.out.print(first+" ");
              if(lim >= 1)     System.out.print(second+" ");
              if(lim>=2)
              {        for(int i = 0 ; i<lim-2;i++)
                        {
                                temp = first+second;
                                 System.out.print(temp+" ");
                                 first = second;
                                  second = temp;
                         }
                }
        }
       public static void main(String args[])
       {
             System.out.print("Enter Your limit : ");
             Scanner sc = new Scanner(System.in);
             int lim =sc.nextInt();
             fib(lim);
       }
}

















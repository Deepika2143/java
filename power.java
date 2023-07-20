import java.util.*;
public class power
{
       public static
        int findPow(int base,int pow)
     {
           int power = 1;
           for(int i = 0; i<pow ;i++)
                 power = power*base;
                 
                 
           return power;
     }
     public static void main(String args[])
     {
          System.out.print("Enter Base : ");
          Scanner sc = new Scanner(System.in);
          int base = sc.nextInt();
          System.out.print("Enter Power : ");
          int pow =  sc.nextInt();
          System.out.println("Base to the Power is : "+findPow(base,pow));
     }
}







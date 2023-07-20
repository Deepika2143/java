import  java.util.*;
class avgInArray
{
       public static float avg(int arr[],int n)
       {
                float sum=0;
                for(int i = 0;i<n;i++)
                     sum = sum + arr[i];
                return sum/n;
       }
       public static void main(String args[])
       {
             System.out.println("Enter No.Of Elements in Your Array : ");
             Scanner sc = new Scanner(System.in);
             int n = sc.nextInt();
               System.out.println("Enter Your Array : ");
             int arr[] = new int[n];
             for(int i = 0;i<n;i++)
                   arr[i] = sc.nextInt();
   //          for(int i = 0;i<n;i++)
    //             System.out.println(arr[i]);
             System.out.println(avg(arr,n));
       }
}


































































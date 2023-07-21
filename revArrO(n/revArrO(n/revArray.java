//Reversing an Array in optimal way
import java.util.*;
public class revArr
{
    
    public static void reverse(int arr[],int size)
    {
         int temp;
         for(int i = 0;i<size/2;i++)
         {
             temp = arr[size-1-i];
             arr[size-1-i] = arr[i];
             arr[i] = temp;
         }
         for(int i = 0;i<size;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        reverse(arr,size);
    }
}

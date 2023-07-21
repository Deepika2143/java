import java.util.*;
public class revArr
{
    
    public static void reverse(int arr[],int size)
    {
         int arr2[] = new int[size];
         for(int i = 0;i<size;i++)
         {
             arr2[i] = arr[size-i-1];
         }
         arr = arr2;
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

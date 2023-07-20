import java.util.*;
public class EligiVOTE
{
        public static void vote(int age)
        {
              if(age > 18)    System.out.println("Eligible to vote");
              else     System.out.println("Not Eligible to vote ");
        }
       public static void main(String args[])
       {
            System.out.print("Enter Your Age : ");
            Scanner st = new Scanner(System.in);
            int n = st.nextInt();
            vote(n);
       }
}










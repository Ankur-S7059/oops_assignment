import java.util.*;
public class Question3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        if(n%2==0)
        System.out.println(n+" is even number");
        else
        System.out.println(n+" is a odd number");
    }
}

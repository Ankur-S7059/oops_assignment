import java.util.*;
public class Question2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        int fact=1,i=0;
        for(i=1;i<=n;i++)
        fact*=i;
        System.out.println("The factorial of "+n+" is "+fact);
    }
}

import java.util.*;
public class Question5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b=sc.nextInt();
        System.out.println("Before : "+"\n"+"a : "+a+"\n"+"b : "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After : "+"\n"+"a : "+a+"\n"+"b : "+b);
    }
}

import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        int rev=0,dig=0,temp=n;
        while(n>0)
        {
            dig=n%10;
            rev=(rev*10)+dig;
            n/=10;
        }
        if(temp==rev)
        System.out.println(temp+" is palindrome no.");
        else
        System.out.println(temp+" is not palindrome no.");
    }
}
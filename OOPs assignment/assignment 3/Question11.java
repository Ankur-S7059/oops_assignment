import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        int rev=0,dig=0,temp=n,c=0;
        while(temp>0)
        {
            c++;
            temp/=10;
        }
        temp=n;
        while(n>0)
        {
            dig=n%10;
            rev+=(int)Math.pow(dig, c);
            n/=10;
        }
        if(rev==temp)
        System.out.println(temp+" is an armstrong number");
        else
        System.out.println(temp+" is not an armstrong number");
    }
}

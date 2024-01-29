import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        int rev=0,dig=0;
        System.out.println("Original no. : "+n);
        while(n>0)
        {
            dig=n%10;
            rev=(rev*10)+dig;
            n/=10;
        }
        System.out.println("Reversed no. : "+rev);
    }
}

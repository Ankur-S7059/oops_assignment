import java.util.Scanner;

public class Question10 {
    public static void bin2dec(String b)
    {
        int decimal=Integer.parseInt(b,2);
        System.out.println("The decimal equivalent : "+decimal);
    }
    public static void dec2bin(int n)
    {
        int dig=0;
        String bin="";
        while(n>0)
        {
            dig=n%2;
            bin=dig+bin;
            n/=2;
        }
        System.out.println("The binary equivalent : "+bin);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("choice 1: decimal to binary\nchoice 2: binary to decimal");
        System.out.println("Enter choice : ");
        int ch=sc.nextInt();
        switch (ch) {
            case 1:System.out.println("Enter decimal number : ");
                   int n=sc.nextInt();
                   dec2bin(n); 
                   break;
            case 2:System.out.println("Enter decimal number : ");
                   String b=sc.next();
                   bin2dec(b); 
                   break;
            default:System.out.println("wrong choice , bye bye");
                    break;
        }
    }
}

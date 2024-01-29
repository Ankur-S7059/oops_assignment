import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter integer value : ");
        int n=sc.nextInt();
        System.out.println("Enter floating pt value : ");
        double d=sc.nextDouble();
        System.out.println("Enter character : ");
        char c=sc.next().charAt(0);
        System.out.println("Integer value : "+n);
        System.out.println("floating point value : "+d);
        System.out.println("character value : "+c);
    }
}

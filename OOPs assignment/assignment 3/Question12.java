import java.util.Scanner;
public class Question12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter range limit : ");
        int n=sc.nextInt();
        int sum=(int)(n*(n+1)/2);
        System.out.println("Sum upto given range limit : "+sum);
    }
}

import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i=0,sum=0;
        for (i = 0; i < n; i++) {
            System.out.println("Enter value : ");
            a[i]=sc.nextInt();
            if(a[i]%2==0)
            sum+=a[i];
        }
        System.out.println("The sum of all elements are : "+sum);
    }
}

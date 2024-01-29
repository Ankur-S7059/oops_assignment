import java.util.*;
class Question1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a the size of array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i=0;
        for (i = 0; i < n; i++) {
            System.out.println("Enter value : ");
            a[i]=sc.nextInt();
        }
        System.out.println("The array elements are : ");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
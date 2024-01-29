import java.util.*;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and columns : ");
        int r=sc.nextInt();
        int a[][]=new int[r][r];
        int i=0,j=0,sum=0;
        for (i = 0; i < r; i++) {
            for(j = 0;j < r; j++){
                System.out.println("Enter element : ");
                a[i][j]=sc.nextInt();
            }
        }
        for (i = 0; i < r; i++) {
            for(j = 0;j < r; j++){
                if(i==j)
                sum+=a[i][j];
            }
        }
        System.out.println("The sum of diagonal elements : "+sum);
    }
}

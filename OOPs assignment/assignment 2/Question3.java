import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and columns : ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        int b[][]=new int[r][c],i=0,j=0;
        int SUM[][]=new int[r][c];
        for (i = 0; i < r; i++) {
            for(j = 0;j < c; j++){
                System.out.println("for A, Enter element : ");
                a[i][j]=sc.nextInt();
            }
        }
        for (i = 0; i < r; i++) {
            for(j = 0;j < c; j++){
                System.out.println("for B, Enter element : ");
                b[i][j]=sc.nextInt();
            }
        }
        for (i = 0; i < r; i++) {
            for(j = 0;j < c; j++){
                
                SUM[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("the sum : ");
        for (i = 0; i < r; i++) {
            for(j = 0;j < c; j++){
                System.out.print(SUM[i][j]+"  ");
            }
            System.out.println();
        }
    }
}

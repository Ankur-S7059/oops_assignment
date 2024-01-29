import java.util.*;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and columns : ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        int b[][]=new int[r][c],i=0,j=0,k=0;
        int M[][]=new int[r][c];
        for (i = 0; i < r; i++) {
            for(j = 0;j < c; j++){
                System.out.println("for 1st matrix, Enter element : ");
                a[i][j]=sc.nextInt();
            }
        }
        for (i = 0; i < r; i++) {
            for(j = 0;j < c; j++){
                System.out.println("for 2nd matrix, Enter element : ");
                b[i][j]=sc.nextInt();
            }
        }
        for (i = 0; i < r; i++) {
            for(j = 0; j < c; j++){
                M[i][j]=0;
                for(k = 0; k < c; k++){
                    M[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("The multiplication of matrix : ");
        for (i = 0; i < r; i++) {
            for(j = 0;j < c; j++){
                System.out.print(M[i][j]+"  ");
            }
            System.out.println();
        }
    }
}

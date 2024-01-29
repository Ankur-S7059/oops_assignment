import java.util.*;
public class Question7 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your percentage : ");
        int p=sc.nextInt();
        char grade;
        if(p>=90)
        grade='A';
        else if(p>=80&&p<90)
        grade='B';
        else if(p>=70&&p<80)
        grade='C';
        else if(p>=60&&p<70)
        grade='D';
        else if(p>=40&&p<60)
        grade='E';
        else
        grade='F';
        System.out.println("The grade is : "+grade);
    }
}

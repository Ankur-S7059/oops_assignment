import java.util.*;
public class Question6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a year : ");
        int yr=sc.nextInt();
        boolean res=false;
        if(yr%4==0)
        res=true;
        else if(yr%400==0)
        res=true;
        else if(yr%100==0)
        res=false;
        else
        res=false;
        String val=(res==true)?"leap year":"not a leap year";
        System.out.println(yr+" is "+val);
    }
}

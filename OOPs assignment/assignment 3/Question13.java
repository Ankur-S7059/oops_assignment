import java.util.Scanner;
public class Question13 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String s="Ankur";
         String s1="Saha";
         int len=s.length();
         char ch=s.charAt(2);
         int val=s.compareTo(s1);
         boolean chk="saha".equals(s1);
         boolean chk_case="ankur".equalsIgnoreCase(s);
         int pos=s.indexOf('k');
         char arr[]=s.toCharArray();
         int n=234;
         String int_val=Integer.toString(n);
         s=s.toUpperCase();
         System.out.println("Upper case : "+s);
         s=" "+s+" ";//adding leading and trailing spaces to the string for trim() func.
         s=s.trim();
         System.out.println("trimmed sentence : "+s);
         System.out.println("length : "+len);
         System.out.println("charAt : "+ch);
         System.out.println("compare to : "+val);
         System.out.println("equals : "+chk);
         System.out.println("equals ignore case : "+chk_case);
         System.out.println("index of : "+pos);
         System.out.println("to string : "+int_val);
         System.out.println("character array : ");
         for(int i=0;i<arr.length;i++)
         System.out.println(arr[i]);
    }
}

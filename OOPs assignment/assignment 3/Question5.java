import java.io.*;
class Question5//input using bufferedreader
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Integer value : ");
        int n=Integer.parseInt(br.readLine());
        System.out.println("Enter floating point : ");
        double d=Double.parseDouble(br.readLine());
        System.out.println("Enter character : ");
        char c=br.readLine().charAt(0);
        System.out.println("Integer value : "+n);
        System.out.println("floating point value : "+d);
        System.out.println("character value : "+c);
    }
}

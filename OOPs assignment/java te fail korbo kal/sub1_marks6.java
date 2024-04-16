class RangeException extends Exception{
    public RangeException(String message){
        super(message);
    }
}
public class sub1_marks6 {
    public static void main(String[] args) {
        if (args.length!=7) {
            System.out.println("the format : java sub1_marks6 <name> <mark1>  <mark2>  <mark3>  <mark4>  <mark5>  <mark6>");
            return;
        }
        String name=args[0];
        int totalmarks=0;
        try{
            for(int i=1;i<args.length;i++){
                int mark=Integer.parseInt(args[i]);
                if(mark<0 || mark>50)
                    throw new RangeException("Marks should in between 0 and 50!");
                totalmarks+=mark;
            }
            double percentage=(totalmarks/6.0)*2 ;
            System.out.println("Name is : "+name);
            System.out.println("Total Marks is  : "+totalmarks);
            System.out.println("Percentage is : "+percentage+" %");
        }catch(NumberFormatException e){
            System.out.println("Error! All marks should be integer");
        }catch(RangeException e){
            System.out.println("Error! "+e.getMessage());
        }
    }
}
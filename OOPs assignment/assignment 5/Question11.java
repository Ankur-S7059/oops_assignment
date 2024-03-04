import java.util.*;

public class Question11 {

    //data members
    private int emp_id;
    private String emp_name;
    private double basic_salary;

    public Question11(int emp_id,String emp_name,double basic_salary){
        //parameterized constructor
        this.emp_id=emp_id;
        this.emp_name=emp_name;
        this.basic_salary=basic_salary;
    }
    public double calculte_gross_pay(){
        //method to calculate the gross pay of the employee
        double grossPay=0;
        grossPay=basic_salary+(0.10*basic_salary);
        return grossPay;
    }
    public void display_details(){
        //display all details of the employee
        System.out.println("Name of employee : "+emp_name);
        System.out.println("Employee id : "+emp_id);
        System.out.println("basic salary : "+basic_salary);
        System.out.println("gross pay : "+calculte_gross_pay());
    }
    //main driver code
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee name : ");
        String empNAME=sc.nextLine();
        System.out.println("Enter employee id : ");
        int empID=sc.nextInt();
        System.out.println("Enter basic pay of employee : ");
        double basicSal=sc.nextDouble();

        Question11 obj=new Question11(empID, empNAME, basicSal);
        obj.display_details();

        sc.close();
    }
}

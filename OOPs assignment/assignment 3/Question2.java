class Question2 {
    int age,year;
    String name,dept;
    Question2(int a,int yr,String n,String d)//parameterized constructor
    {
        age=a;
        year=yr;
        name=n;
        dept=d;
    }
    void display()
    {
        System.out.println("name : "+name);
        System.out.println("year : "+year);
        System.out.println("age : "+age);
        System.out.println("department : "+dept);
    }
    public static void main(String[] args) {
        Question2 ob=new Question2(20, 2023, "Ankur", "CSE");//parameterized constructor
        ob.display();
    }
}

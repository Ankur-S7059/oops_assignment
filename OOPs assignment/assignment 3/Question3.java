
//call by value
class Question3 {
    int data;
    Question3()
    {
        data=50;
    }
    void change(int data) {
        data = data + 100;// changes will be in the local variable only
    }
    public static void main(String args[]) {
        Question3 op = new Question3();

        System.out.println("before change : " + op.data);
        op.change(500);
        System.out.println("after change : " + op.data);

    }
}
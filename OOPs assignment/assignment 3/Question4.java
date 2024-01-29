//call by reference
class Question4 {
    int data;
    Question4()
    {
        data=50;
    }
    void change(Question4 op) {
        op.data = op.data + 100;// changes will be in the instance variable
    }

    public static void main(String args[]) {
        Question4 op = new Question4();

        System.out.println("before change : " + op.data);
        op.change(op);// passing object
        System.out.println("after change : " + op.data);

    }
}

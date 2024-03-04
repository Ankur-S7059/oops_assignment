public class Question12 {
    private int numerator;
    private int denominator;
    
    public Question12() {
        numerator = 1;
        denominator = 1;
    }
    
    public Question12(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            System.out.println("Error: Denominator cannot be zero. Setting denominator to 1.");
            this.denominator = 1;
        }
    }
    
    public Question12(int numerator) {
        this.numerator = numerator;
        denominator = 1;
    }
    
    public void displayFraction() {
        System.out.println(numerator + "/" + denominator);
    }
    
    public double calculateDecimalValue() {
        return (double) numerator / denominator;
    }
    
    public static void main(String[] args) {
        Question12 fraction1 = new Question12();
        Question12 fraction2 = new Question12(3, 4);
        Question12 fraction3 = new Question12(5);
        
        System.out.print("Fraction 1: ");
        fraction1.displayFraction();
        System.out.println("Decimal value: " + fraction1.calculateDecimalValue());
        
        System.out.print("Fraction 2: ");
        fraction2.displayFraction();
        System.out.println("Decimal value: " + fraction2.calculateDecimalValue());
        
        System.out.print("Fraction 3: ");
        fraction3.displayFraction();
        System.out.println("Decimal value: " + fraction3.calculateDecimalValue());
    }
}


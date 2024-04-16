// Define a custom exception class named CheckArgumentException
class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}
public class Add5number {
    public static void main(String[] args) {
        try {
            // Check if the number of command line arguments is less than 5
            if (args.length < 5) {
                // If less than 5, throw the CheckArgumentException
                throw new CheckArgumentException("Number of arguments must be at least 5");
            } else {
                // If 5 or more arguments, calculate and print their sum
                int sum = 0;
                for (int i=0;i<5;i++) {
                    sum += Integer.parseInt(args[i]);
                }
                System.out.println("Sum of first 5 arguments: " + sum);
            }
        } catch (CheckArgumentException e) {
            // Catch the CheckArgumentException and print the error message
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            // Catch NumberFormatException if any argument is not a valid integer
            System.out.println("Error: All arguments must be integers");
        }
    }
}

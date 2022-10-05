import java.util.Scanner;

public class App {

    private static final Scanner scanner = new Scanner(System.in);

    private static String getString(String prompt) {

        System.out.println(prompt);

        String input = scanner.nextLine();

        return input;
    }

    private static double getDouble(String prompt) {

        System.out.println(prompt);

        double dInput = scanner.nextDouble();

        return dInput;

    }

    public static double calculate(double num1, double num2){

        String option = getString("What would you like to do? \n add \n subtract \n multiply \n divide");

        double sum = 0; 

        if (option.equals("add")) 
            System.out.println(String.format("Adding: %.2f and %.2f", num1, num2));
            sum = Calculator.add(num1, num2);
        

        if (option.equals("subtract")) 
            System.out.println(String.format("Subtracting: %.2f and %.2f", num1, num2));
            sum = Calculator.subtract(num1, num2);
        

        if (option.equals("multiply")) 
            System.out.println(String.format("Multilplying: %.2f and %.2f", num1, num2));
            sum = Calculator.multiply(num1, num2);
        

        if (option.equals("divide"))
            System.out.println(String.format("Dividing: %.2f and %.2f", num1, num2));
            sum = Calculator.divide(num1, num2);
        

        return sum;

    }


    public static void main(String[] args) {
        
        while (true) {

        double dub1 = getDouble("Input first number.");
        double dub2 = getDouble("Input second number.");
            
           calculate(dub1, dub2);

        String response = getString("Would you like to input again? (Y/N)");

            if (response.equals("N")) {
                System.out.println("Goodbye.");
                break;
            }

        }
      


    }

}
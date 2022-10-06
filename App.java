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

    public static void menu(){

         String select = getString("Welcome to the SIMPLE CALCULATOR! \n  What would you like to do? (please type a number) \n 1. add \n 2. subtract \n 3. multiply \n 4. divide");

         if (select.equals("1")){

            double num1 = getDouble("Input first number.");
            double num2 = getDouble("Input second number.");
            double add = Calculator.add(num1, num2);
            System.out.println("Answer = " + add);

         }

         if (select.equals("2")){

            double num1 = getDouble("Input first number.");
            double num2 = getDouble("Input second number.");
            double sub = Calculator.subtract(num1, num2);
            System.out.println("Answer = " + sub);

         }

         if (select.equals("3")){

            double num1 = getDouble("Input first number.");
            double num2 = getDouble("Input second number.");
            double mult = Calculator.multiply(num1, num2);
            System.out.println("Answer = " + mult);

         }

         if (select.equals("4")){

            double num1 = getDouble("Input first number.");
            double num2 = getDouble("Input second number.");
            double div = Calculator.divide(num1, num2);

            System.out.println("Answer = " + div);

         }

         
         
    }


    public static void main(String[] args) {
        
        menu(); 
        
    }

}

import java.util.Scanner;


public class Calculator {
     static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
        System.out.println("Options-");
        System.out.println("1.basic Arthoimatic Operation");
        System.out.println("2.Scintific calculator");
        System.out.println("3. Unit Conversions");
        System.out.println("4, currency Conversion");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:basicArithmetic();
                break;
            case 2:scientificCalculations();
                break;
            case 3:temperatureConversion();
                break;
            case 4:currencyConversion();
                break;
            case 5:
               System.out.println("Exiting Calculator. Goodbye!");
               return;
            default:
               System.out.println("Invalid choice. Try again.");
        }
    }
}


    public static void basicArithmetic(){
        System.out.println("enter the 1st no-");
        double a = sc.nextDouble();
        System.out.println("enter the operator(+,-,*,/):");
        char opr = sc.next().charAt(0);
        System.out.println("enter the 2nd no-");
        double b = sc.nextDouble();
        switch (opr) {
            case '+':
            System.out.println("Result: " + (a + b));
                break;
            case '-':
            System.out.println("Result: " + (a - b));
                break;
            case '*':
            System.out.println("Result: " + (a * b));
                break;
            case '/':
            try {
                System.out.println("Result:"+(a/b));
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            default:
            System.out.println("Invalid operator.");
        }
    }

    public static void scientificCalculations(){
        System.out.println("1. Square Root");
        System.out.println("2. Power");
        System.out.print("Choose operation: ");
        int option = sc.nextInt();
        switch (option) {
            case 1:
            System.out.print("Enter number: ");
            double x = sc.nextDouble();
            try {
                System.out.println("Square root: " + Math.sqrt(x));
            } catch (Exception e) {
                System.out.println(e);
            }
                break;
            case 2:
            System.out.println("enter base:");
            double base = sc.nextDouble();
            System.out.print("Enter exponent: ");
            double exp = sc.nextDouble();
            System.out.println("Result: " + Math.pow(base, exp));
                break;
            default:
             System.out.println("Invalid option.");
        }
    }
    
    public static void temperatureConversion(){
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose: ");
        int opt = sc.nextInt();
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        if (opt == 1) {
            System.out.println("Fahrenheit: " + ((temp * 9 / 5) + 32));
        } else if (opt == 2) {
            System.out.println("Celsius: " + ((temp - 32) * 5 / 9));
        } else {
            System.out.println("Invalid option.");
        }
    }

    static void currencyConversion() {
        final double USD_TO_INR = 85.53;
        final double INR_TO_USD = 1;

        System.out.println("1. USD to INR");
        System.out.println("2. INR to USD");
        System.out.print("Choose: ");
        int opt = sc.nextInt();

        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();

        if (opt == 1) {
            System.out.println("INR: Rs" + (amt * USD_TO_INR));
        } else if (opt == 2) {
            System.out.println("USD: $" + (amt * INR_TO_USD));
        } else {
            System.out.println("Invalid option.");
        }
    }

}

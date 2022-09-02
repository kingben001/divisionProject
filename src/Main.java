import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     int num1 = getNumerator();
     double denom1 = getDenominator();
     double quotient = calculateQuotient(num1,denom1);
     print(quotient);

    }

    public static void print(double quotient) {
        System.out.println(quotient);
    }

    public static double calculateQuotient(int num1, double denom1) {
        double total = num1/denom1;
        return total;
    }


    public static int getNumerator(){
        Scanner keyboard = new Scanner(System.in);


        System.out.println("What is your numerator?");
        int numerator = keyboard.nextInt();
        return numerator;
    }

    public static double getDenominator(){
        Scanner keyboard = new Scanner(System.in);

        double denominator;
        do {
            System.out.println("What is your denominator");
            denominator = keyboard.nextDouble();

            if (denominator == 0.0) {
                System.out.println("Please enter a number besides 0");
            }
        } while (denominator == 0);

        return denominator;
    }
}

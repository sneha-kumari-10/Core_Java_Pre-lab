package prelab;

public class Factorial {
    public static void main(String[] args) {
        int number = 5; // Hardcoded user input
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i; // factorial = factorial * i
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}


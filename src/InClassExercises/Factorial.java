package InClassExercises;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("5! is " + findFactorial(5));
        System.out.println("20! is " + findFactorial(20));
        System.out.println("1! is " + findFactorial(1));
    }

    public static int findFactorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return (number * findFactorial(number - 1));
        }
    }
}

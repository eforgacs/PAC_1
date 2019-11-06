package InClassExercises;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("5 is " + fibonacci(5));
        System.out.println("20 is " + fibonacci(20));
        System.out.println("1 is " + fibonacci(1));
    }
    public static int fibonacci(int n)
    {
        if( n==0||n==1){
            return n;
        }
        else
        {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}

package InClassExercises;

public class RecursionPractice {

    public static double m(int i) {
        if (i == 1) {
            return 1;
        } else
            return m(i - 1) + 1.0 / i;
    }


    public static void main(String[] args) {
        System.out.println(m(5));
    }
}

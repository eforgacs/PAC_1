package InClassExercises;

public class TestRecursion {

    public static void main(String[] args) {
        count(0);
    }

    public static void count(int index) {
        if (index < 15399)
            count(index + 1);
        System.out.println(index);
    }
}

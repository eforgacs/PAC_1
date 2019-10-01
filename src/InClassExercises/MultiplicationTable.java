package InClassExercises;

public class MultiplicationTable {
    public static void main(String[] args) {
        int mult;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ": ");
            for (int j = 1; j <= 10; j++) {
                mult = i*j;
                if (mult < 10) System.out.print("  ");
                else if (mult < 100) System.out.print(" ");
                System.out.print(mult + " ");
            }
            System.out.println();
        }
    }

}

package InClassExercises;

public class Quiz1Question3 {

    public static void main(String[] args) {
        int inner = 1, outer;
        for (outer = 5; outer >= inner; outer--) {
            switch (inner % 2) {
                case 0:
                    System.out.print("+");
                    break;
                case 1:
                    System.out.print("-");
                    break;
                case 2:
                    System.out.print("*");
                    break;
            }
            ++inner;
            System.out.println();
        }
    }
}
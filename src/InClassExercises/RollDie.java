package InClassExercises;

public class RollDie {
    public static void main(String[] args) {
        int max = 6;
        int min = 1;
        int[] die_rolls = new int[6000];
        for (int i = 0; i < die_rolls.length; i++) {
            int die_roll = (int) (Math.random() * ((max - min) + 1) + min);
            System.out.println(die_roll);
        }

//        int[] counts = new int[6];
//
//        for(int i = 0; i < 6000; i++) {
//            int result = (int) (Math.random() = 6);
//            counts[ result ]++;
    }
}





package InClassExercises;

public class Quiz1Question1 {

    public static void main(String[] args) {
        System.out.println(getLargestMiddle(123, 456));
    }

    public static int getLargestMiddle(int firstInt, int secondInt) {
        String firstIntString = String.valueOf(firstInt);
//        String firstIntString = (String) firstInt;
        String secondIntString = String.valueOf(secondInt);

        // if (firstIntString[1] > secondIntString[1]))
        if (firstIntString.charAt(1) > secondIntString.charAt(1)) {
            return firstInt;
        } else {
            return secondInt;
        }
    }
}

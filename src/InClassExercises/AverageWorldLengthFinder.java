package InClassExercises;

public class AverageWorldLengthFinder {

    public static void main(String[] args) {
        String[] words = {"hi", "whatever", "example", "world", "test"};
        int total = 0;
        for (String word : words) {
            int wordLength = word.length();
            total += wordLength;
        }
        int average = 0;
        for(int i = 0; i < words.length; i++){
            average = total / words.length;
        }
        System.out.println(average);
    }
}

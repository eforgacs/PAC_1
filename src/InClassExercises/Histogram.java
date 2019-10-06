package InClassExercises;

public class Histogram {

    public static void main(String[] args) {

        int[] array = {19, 3, 15, 7, 11, 9, 13};
        System.out.println("Element\tValue\tHistogram");
        for(int i = 0; i < array.length; i++){
            System.out.print(i + "\t" + array[i]);
            for(int j = 0; j < array.length; j++){
                System.out.print("*");
            }
//            System.out.println("*" * array[i]);
        }
    }
}

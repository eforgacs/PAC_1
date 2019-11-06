package InClassExercises;

public class BigO {

    public static void main(String[] args) {


        int y = 9 + 10; // 1 instruction
        // O(1)
        int z = 100 / 20 + 30 * 40 % 50; // 5 instructions
        // O(1)
        int[][] matrix = {{}, {}, {},};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // check value
                if (matrix[i][j] == 1)
                    System.out.println("Found it!");
            }   //matrix[1].length is n
            // n * O(1)
            // O(n)
        } // matrix.length is m
    } // m * O(n)
}// O(n) * O(n)
// O(n^2)



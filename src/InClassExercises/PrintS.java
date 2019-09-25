package InClassExercises;

public class PrintS {

    public static void main(String[] args) {

        int horizontalLength = 6;
        int verticalLength = horizontalLength / 2 - 1;
        printHorizontalSLine(horizontalLength);
        printVerticalSLine(verticalLength);
        printHorizontalSLine(horizontalLength);
        printIndentedVerticalSLine(verticalLength, horizontalLength);
        printHorizontalSLine(horizontalLength);
    }

    private static void printVerticalSLine(int verticalLength) {
        for(int i = 0; i < verticalLength; i++) {
            System.out.println("S");
        }
    }
    private static void printIndentedVerticalSLine(int verticalLength, int horizontalLength) {
        for(int i = 0; i < horizontalLength; i++){
            System.out.print("");
        }
        for(int i = 0; i < verticalLength; i++) {
            System.out.println("S");
        }
    }

    private static void printHorizontalSLine(int horizontalLength) {

        for(int i = 0; i < horizontalLength; i++) {
            System.out.print("S");
        }
    }
}

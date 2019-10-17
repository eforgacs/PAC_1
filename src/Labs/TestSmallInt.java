package Labs;

import java.util.Scanner;

public class TestSmallInt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a number between 0 and " + SmallInt.MAXVALUE + ": ");
        SmallInt mySmallInt = new SmallInt(0);
        mySmallInt.setDec(s.nextInt());
        String decimalValue = mySmallInt.getDec();
        String binaryValue = mySmallInt.getBin();
        String hexValue = mySmallInt.getHex();
        System.out.println("Decimal: " + decimalValue);
        System.out.println("Binary: " + binaryValue);
        System.out.println("Hexadecimal: " + hexValue);

        System.out.println("Testing sameValue...");
        System.out.println("Argument 1: " + binaryValue);
        System.out.println("Argument 2: " + hexValue);
        System.out.println(SmallInt.sameValue(binaryValue, hexValue));

//        Uncomment the call to the testSameValueUsingAssignmentTestCases() method
//        in order to enable the test cases from the extra credit description.

//        testSameValueUsingAssignmentTestCases();
    }

    private static void testSameValueUsingAssignmentTestCases() {
        System.out.println("Testing sameValue using test cases provided in the assignment...");
        System.out.println("Should be true:");
        System.out.println(SmallInt.sameValue("101", "5")); //would return true
        System.out.println("Should be false:");
        System.out.println(SmallInt.sameValue("101", "6")); //would return false
        System.out.println("Should be true:");
        System.out.println(SmallInt.sameValue("1101", "D")); //would return true
        System.out.println("Should be false:");
        System.out.println(SmallInt.sameValue("1101", "5")); //would return false
        System.out.println("Should be true:");
        System.out.println(SmallInt.sameValue("11010101", "D5")); //would return true
        System.out.println("Should be true:");
        System.out.println(SmallInt.sameValue("1011101", "5D")); //would return true
    }
}

package Labs;

class SmallInt {
    private int value;
    static final int MAXVALUE = 1000;

    SmallInt(int passedValue) {
        value = 0;
        if (verifyRange(passedValue)) {
            value = passedValue;
        }
    }

    private boolean verifyRange(int valueToCheck) {
        if (valueToCheck >= 0 && valueToCheck <= MAXVALUE) {
            return true;
        } else {
            System.out.println("The value chosen is not between 0 and 1000. Please try again.");
            return false;
        }
    }

    String getDec() {
//        I think this is the best way to do this,
//        even though the assignment says:
//        "The easiest way to create this String is to concatenate the int representation to an empty String."
//        (i.e., return "" + value;)
        return Integer.toString(value);
    }

    void setDec(int passedIntToSet) {
        value = 0;
        if (verifyRange(passedIntToSet)) {
            value = passedIntToSet;
        }
    }

    String getBin() {
//        create a new StringBuilder.
//        IntelliJ IDEA recommended StringBuilder over String.
//        Example number will be 1010100 in binary, or 84 in decimal.
        StringBuilder binaryStringBuilder = new StringBuilder();
        int temp = value;
//        while temp is greater than 0,
        while (temp > 0) {
//            check to see if 2 can be divided evenly into the integer passed in.
//            if so, append a 0 to the StringBuilder.
//            otherwise, append a 1.
//            (this is done using a ternary operator).
            binaryStringBuilder.insert(0, ((temp % 2) == 0 ? "0" : "1"));
//            divide the integer by 2 until the while loop condition becomes false.
//            In this case, that would mean that n > 0 would evaluate to false.
            temp /= 2;
        }
//        lastly, return the binary StringBuilder and convert it to a String.
        return binaryStringBuilder.toString();
//        In the case of 84 (1010100),
//        84 / 2 = 42 remainder 0, 85 % 2 = 0.
//        42 / 2 = 21 remainder 0, 42 % 2 = 0.
//        21 / 2 = 10 remainder 1, 21 % 2 = 1.
//        10 / 2 =  5 remainder 0, 10 % 2 = 0.
//        5  / 2 =  2 remainder 1,  5 % 2 = 1.
//        2  / 2 =  1 remainder 0,  2 % 2 = 0.
//        1 /  2 =  1 remainder 1,  1 % 2 = 1.
//        The string is built from right to left as the integers are added to the string.
    }

    String getHex() {
//        create a new StringBuilder.
        int temp = value;
        StringBuilder hexString = new StringBuilder();
        int remainder;
//        while n is greater than 0,
        while (temp > 0) {
//            create a variable called remainder which gets the mod (remainder) of dividing by 16.
            remainder = temp % 16;
//            if the remainder of dividing by 16 is greater than 10,
            if (remainder >= 10) {
//                use the StringBuilder equivalent of the code snippet provided in the assignment, which is:
//                hexString = (char) (‘A’ + remainder - 10) + hexString;
                //where hexString is the string to be returned by the method
//                this takes care of the A-F range, or 10-15 in decimal.
                hexString.insert(0, (char) ('A' + remainder - 10));
            }
//            or else, if the remainder is not greater than 10,
            else {
//                just insert the remainder into the StringBuilder, since it would be the same as decimal anyway.
                hexString.insert(0, remainder);
            }
//            then divide by 16 until the while loop condition becomes false.
//            In this case, that would mean that n > 0 would evaluate to false.
            temp /= 16;
        }

// Lastly, return the hexadecimal StringBuilder converted to a String.
        return hexString.toString();
    }

    private static String toHex(int passedInt) {
//        create a new StringBuilder.
        int temp = passedInt;
        StringBuilder hexString = new StringBuilder();
        int remainder;
//        while n is greater than 0,
        while (temp > 0) {
//            create a variable called remainder which gets the mod (remainder) of dividing by 16.
            remainder = temp % 16;
//            if the remainder of dividing by 16 is greater than 10,
            if (remainder >= 10) {
//                use the StringBuilder equivalent of the code snippet provided in the assignment, which is:
//                hexString = (char) (‘A’ + remainder - 10) + hexString;
                //where hexString is the string to be returned by the method
//                this takes care of the A-F range, or 10-15 in decimal.
                hexString.insert(0, (char) ('A' + remainder - 10));
            }
//            or else, if the remainder is not greater than 10,
            else {
//                just insert the remainder into the StringBuilder, since it would be the same as decimal anyway.
                hexString.insert(0, remainder);
            }
//            then divide by 16 until the while loop condition becomes false.
//            In this case, that would mean that n > 0 would evaluate to false.
            temp /= 16;
        }

// Lastly, return the hexadecimal StringBuilder converted to a String.
        return hexString.toString();
    }

    private static int binaryToDecimal(int binaryInt) {
        int decimal = 0;
        int power = 0;
        while (binaryInt != 0) {
//            Multiply each digit by 2^power
            decimal += ((binaryInt % 10) * Math.pow(2, power));
//            Cut off the last digit by dividing by 10.
            binaryInt = binaryInt / 10;
//            Increment the power each time.
            power++;
        }
        return (decimal);

    }

    static boolean sameValue(String binaryString, String hexString) {

        String binAsHex = "";
        try {
            binAsHex = convertBinaryToHex(binaryString);


        } catch (NumberFormatException e) {
            System.out.println("Your number is formatted incorrectly (perhaps out of range?).");
        }

        return binAsHex.equals(hexString);
    }

    private static String convertBinaryToHex(String binaryString) {
        int binaryStringAsInt;
        int decimalInt;
        binaryStringAsInt = Integer.parseInt(binaryString);
        decimalInt = binaryToDecimal(binaryStringAsInt);
        return toHex(decimalInt);
    }

}

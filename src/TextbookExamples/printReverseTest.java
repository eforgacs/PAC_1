package TextbookExamples;

public class printReverseTest {

    public static void main(String[] args) {
        String s = "Edward Forgacs";
        char[] c = s.toCharArray();
        printReverseTest.printReverse(c);
    }

    private static void printReverse(char [] str) {
        helper(0, str);
    }

    private static void helper(int index, char [] str) {
        if (str == null || index >= str.length) {
            return;
        }
        helper(index + 1, str);
        System.out.print(str[index]);
    }
}

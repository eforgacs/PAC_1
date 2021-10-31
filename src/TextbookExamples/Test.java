package TextbookExamples;

public class Test {
    int x;

    public Test(String t) {
        System.out.println("Test");
    }

    public static void main(String[] args) {
        Test test = new Test("hi");
        System.out.println(test.x);
    }
}
package TextbookExamples;

interface Compare<T> {
    int a = 0;

    int compareWith(T a);
}

class A implements Compare<A> {
    private int grade;

    A(int grade) {
        this.grade = grade;
        System.out.print(a);
    }

    public int compareWith(A a) {
        if (this.grade > a.grade)
            return 1;
        else if (this.grade == a.grade)
            return 0;
        else
            return -1;
    }
}

public class Main {

    public static void main(String[] args) {

        A a1 = new A(166);
        A a2 = new A(167);
        System.out.println(a1.compareWith(a2));
    }
}

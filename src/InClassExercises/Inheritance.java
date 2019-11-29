package InClassExercises;

public class Inheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.i = 1;
        obj.j = 2;
        obj.display();
    }
}

class A {
    int i;
}

class B extends A {
    int j;

    void display() {
        i = j + 1;
        System.out.println(j + " " + i);
    }
}
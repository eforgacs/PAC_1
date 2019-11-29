package InClassExercises.ShowErrors;

class A {
    A(int x) {
    }

//    public A() {
//    }
}

class B extends A {
    B() {
        super(9);
    }
}

class C {
    public static void main(String[] args) {
        B b = new B();
    }
}
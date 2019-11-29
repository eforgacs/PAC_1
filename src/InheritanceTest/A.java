package InheritanceTest;

class A {
    public A(int x){
    }
}

class B extends A{
    public B(){
        super(8);
    }
}

class C{
    public static void main(String[] args) {
        B b = new B();
    }
}

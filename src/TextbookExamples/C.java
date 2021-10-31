package TextbookExamples;

public class C {
    private int p;

    public C(){
        this(0);
        System.out.println("C's no-arg constructor invoked");

    }

    public C(int p){
        p = p;
    }

    public void setP(int p){
        p = p;
    }
}

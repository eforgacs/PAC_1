package InheritanceTest;

public class Cat extends Animal {

    public String favoriteToy = "mouse";

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

    public String chaseMice(){
        return "Squeak";
    }
}

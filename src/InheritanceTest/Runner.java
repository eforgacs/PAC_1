package InheritanceTest;

public class Runner {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeNoise();
        Animal myAnimal2 = new Cat();
        myAnimal2.makeNoise();
        System.out.println(((Cat) myAnimal2).favoriteToy);
        System.out.println(((Cat) myAnimal2).chaseMice());
        Cat myCat = new Cat();
        myCat.chaseMice();
        myCat.makeNoise();
        System.out.println(myCat.favoriteToy);
    }
}

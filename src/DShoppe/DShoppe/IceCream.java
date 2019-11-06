package DShoppe.DShoppe;

public class IceCream extends DessertItem {
    private int cost;
    IceCream(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return cost;
    }
}

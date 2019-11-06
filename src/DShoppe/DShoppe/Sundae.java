package DShoppe.DShoppe;

public class Sundae extends IceCream {
    private int toppingCost;
    private int cost;

    Sundae(String name, int cost, String toppingName, int toppingCost) {
        super(name, cost);
        this.toppingCost = toppingCost;

    }

    @Override
    public int getCost() {
        return cost + toppingCost;
    }
}

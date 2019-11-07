package DShoppe.DShoppe;

public class Sundae extends IceCream {
    private int toppingCost;
    private int cost;
    private String toppingName;

    Sundae(String name, int cost, String toppingName, int toppingCost) {
        super(name, cost);
        this.cost = cost;
        this.toppingCost = toppingCost;
        this.toppingName = toppingName;

    }

    @Override
    public int getCost() {
        return this.cost + this.toppingCost;
    }

    String getToppingName() {
        return this.toppingName;
    }

}

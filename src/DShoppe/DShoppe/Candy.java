package DShoppe.DShoppe;

public class Candy extends DessertItem {
    private double weight;
    private int pricePerPound;

    Candy(String name, double weight, int pricePerPound) {
        this.name = name;
        this.weight = weight;
        this.pricePerPound = pricePerPound;
    }

    @Override
    public int getCost() {
        return Math.round((int) (weight * pricePerPound));
    }


    double getWeight() {
        return this.weight;
    }

    int getPricePerPound() {
        return this.pricePerPound;
    }
}

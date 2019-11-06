package DShoppe.DShoppe;

public class Candy extends DessertItem {
    public double weight;
    private float pricePerPound;

    Candy(String name, double weight, int pricePerPound) {
        this.name = name;
        this.weight = weight;
        this.pricePerPound = pricePerPound;
    }

    @Override
    public int getCost() {
        return (int) (weight * pricePerPound);
    }


    public int getWeight() {
        return (int) this.weight;
    }
}

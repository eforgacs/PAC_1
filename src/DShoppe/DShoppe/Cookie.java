package DShoppe.DShoppe;

public class Cookie extends DessertItem {
    private int number;
    private float pricePerDozen;

    Cookie(String name, int number, int pricePerDozen) {
        this.name = name;
        this.number = number;
        this.pricePerDozen = pricePerDozen;
    }


    @Override
    public int getCost() {
        return (int) ((pricePerDozen / 12) * number);
    }
}

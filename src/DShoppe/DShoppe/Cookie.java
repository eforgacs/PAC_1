package DShoppe.DShoppe;

public class Cookie extends DessertItem {
    private int number;
    private int pricePerDozen;

    Cookie(String name, int number, int pricePerDozen) {
        this.name = name;
        this.number = number;
        this.pricePerDozen = pricePerDozen;
    }


    @Override
    public int getCost() {
        return ((pricePerDozen / 12) * number);
    }


    int getNumberOfCookies() {
        return this.number;
    }

    float getPricePerDozen() {
        return this.pricePerDozen;
    }
}
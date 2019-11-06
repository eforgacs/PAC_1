package DShoppe.DShoppe;

public class Checkout {
    private DessertItem[] dessertItemArray;
    private int itemNumbers;
    private int totalTax;

    Checkout() {
        dessertItemArray = new DessertItem[100];
        itemNumbers = 0;
    }

    void clear() {
        for (int i = 0; i < itemNumbers; i++) {
            dessertItemArray[i] = null;
        }
        itemNumbers = 0;

    }

    void enterItem(DessertItem item) {
        dessertItemArray[itemNumbers++] = item;

    }


    int numberOfItems() {
//        Can also be done this way:
//        int count = 0;
//        for (int i = 0; i < dessertItemArray.length; i++) {
//            if (dessertItemArray[i] != null) {
//                count++;
//            }
        return itemNumbers;
    }

    @Override
    public String toString() {
        StringBuilder receipt = new StringBuilder();
        String storeName = DessertShoppe.STORE_NAME;
        String divider = "--------------------";
        String storeNameLine = String.format("%28s%n", storeName);
        String dividerLine = String.format("%28s%n", divider);
        String tax = "Tax";
        String taxInDollarsAndCents = DessertShoppe.cents2dollarsAndCents(totalTax());
        String totalCost = "Total Cost";
        String totalCostInDollarsAndCents = DessertShoppe.cents2dollarsAndCents(totalCost());
        receipt.append(storeNameLine);
        receipt.append(dividerLine);
        for (int i = 0; i < itemNumbers; i++) {
            int cost = dessertItemArray[i].getCost();
//            if (dessertItemArray[i] instanceof Candy){
//                double candyWeight = (Candy)dessertItemArray[i].getWeight();
//            }
            String costInDollarsAndCents = DessertShoppe.cents2dollarsAndCents(cost);
            String itemLine = String.format("%-30s%5s%n", dessertItemArray[i].name, costInDollarsAndCents);
            receipt.append(itemLine);
        }
        String taxLine = String.format("%-30s%5s%n", tax, taxInDollarsAndCents);
        String totalCostLine = String.format("%-30s%5s%n", totalCost, totalCostInDollarsAndCents);
        receipt.append(taxLine);
        receipt.append(totalCostLine);
        return receipt.toString();
    }

    int totalCost() {
        int cost = 0;
        for (int i = 0; i < itemNumbers; i++) {
            cost += dessertItemArray[i].getCost();
        }
        return cost + this.totalTax;
    }

    int totalTax() {
        this.totalTax = (int) (totalCost() * (DessertShoppe.TAX_RATE / 100));
        return (int) (totalCost() * (DessertShoppe.TAX_RATE / 100));

    }
}

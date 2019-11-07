package DShoppe.DShoppe;

public class Checkout {
    private DessertItem[] dessertItemArray;
    public int numberOfItems;

    Checkout() {
        dessertItemArray = new DessertItem[100];
        numberOfItems = 0;
    }

    public void clear() {
        for (int i = 0; i < numberOfItems; i++) {
            dessertItemArray[i] = null;
        }
        numberOfItems = 0;

    }

    public void enterItem(DessertItem item) {
        dessertItemArray[numberOfItems++] = item;

    }


    int numberOfItems() {
//        Can also be done this way:
//        int count = 0;
//        for (int i = 0; i < dessertItemArray.length; i++) {
//            if (dessertItemArray[i] != null) {
//                count++;
//            }
        return numberOfItems;
    }

    @Override
    public java.lang.String toString() {
        StringBuilder receipt = new StringBuilder();
        String storeName = DessertShoppe.STORE_NAME;
        String divider = "--------------------";
        String storeNameLine = String.format("%28s%n", storeName);
        String dividerLine = String.format("%28s%n", divider);
        String tax = "Tax";
        String taxInDollarsAndCents = DessertShoppe.cents2dollarsAndCents(totalTax());
        String totalCost = "Total Cost";
//        String totalCostInDollarsAndCents = DessertShoppe.cents2dollarsAndCents(totalCost());
        String totalCostPlusTaxInDollarsAndCents = DessertShoppe.cents2dollarsAndCents(totalCost() + totalTax());
        receipt.append(storeNameLine);
        receipt.append(dividerLine);
        for (int i = 0; i < numberOfItems; i++) {
            int cost = dessertItemArray[i].getCost();
            if (dessertItemArray[i] instanceof Candy) {
                double candyWeight = ((Candy) dessertItemArray[i]).getWeight();
                String candyCost = DessertShoppe.cents2dollarsAndCents((int) ((Candy) dessertItemArray[i]).getPricePerPound());
//                String candyCostPerPoundLine = candyWeight + " lbs. @ " + candyCost + " /lb" + "\n";
                String candyCostPerPoundLine = String.format("%.2f%s%s%s%n", candyWeight, " lbs. @ ", candyCost, " /lb");
                receipt.append(candyCostPerPoundLine);
            } else if (dessertItemArray[i] instanceof Cookie) {
                int numberOfCookies = ((Cookie) dessertItemArray[i]).getNumberOfCookies();
                String cookieCost = DessertShoppe.cents2dollarsAndCents((int) ((Cookie) dessertItemArray[i]).getPricePerDozen());
//                String cookiesCostPerDozenLine = numberOfCookies + " @ " + cookieCost + " /dz." + "\n";
                String cookiesCostPerDozenLine = String.format("%s%n", numberOfCookies + " @ " + cookieCost + " /dz.");
                receipt.append(cookiesCostPerDozenLine);
            } else if (dessertItemArray[i] instanceof Sundae) {
                String toppingName = ((Sundae) dessertItemArray[i]).getToppingName();
                String sundaeCostLine = String.format("%s Sundae with%n", toppingName);
                receipt.append(sundaeCostLine);
            }
            String costInDollarsAndCents = DessertShoppe.cents2dollarsAndCents(cost);
            String itemLine = String.format("%-30s%5s%n", dessertItemArray[i].name, costInDollarsAndCents);
            receipt.append(itemLine);

        }
        String taxLine = String.format("%n%-30s%5s%n", tax, taxInDollarsAndCents);
        String totalCostLine = String.format("%-30s%5s%n", totalCost, totalCostPlusTaxInDollarsAndCents);
        receipt.append(taxLine);
        receipt.append(totalCostLine);
        return receipt.toString();
    }

    public int totalCost() {
        int cost = 0;
        for (int i = 0; i < numberOfItems; i++) {
            cost += dessertItemArray[i].getCost();
        }
        return cost;
    }

    public int totalTax() {
        return (int) (totalCost() * (DessertShoppe.TAX_RATE / 100));
    }
}

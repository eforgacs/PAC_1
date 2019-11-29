package Midterm2;

public abstract class Claim {
    double cost;
    public Claim(){
    }
    public double totalCost(){
        this.cost = getCost();
        return this.cost;
    }
    public double getCost(){
        return this.cost;
    }
}


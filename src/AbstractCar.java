public abstract class AbstractCar {
    boolean isSedan = false;
    String seats = "";

    AbstractCar(boolean isSedan, String seats){
        this.isSedan = isSedan;
        this.seats = seats;
    }

    public AbstractCar() {
        
    }

    boolean isSedan(){
        return this.isSedan;
    }

    String getSeats() {
        return this.seats;
    }

    abstract String getMileage();
}

class WagonR extends AbstractCar{
    String carMileage = "";
    WagonR(){
        super();
    }

    @Override
    String getMileage() {
        return null;
    }
}
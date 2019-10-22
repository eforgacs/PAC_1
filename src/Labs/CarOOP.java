package Labs;

import java.util.Random;
import java.util.Scanner;

public class CarOOP {
    private static final int MIN = 1;
    private static final int MAX = 20;
    private static Scanner s = new Scanner(System.in);
    private char color;
    private boolean ignition;
    private int xCoordinate;
    private int yCoordinate;

    public CarOOP() {
        ignition = false;
        assignColor();
        randomizeXCoordinate();
        randomizeYCoordinate();
    }

    public static void main(String[] args) {
        CarOOP[] myCarOOP = new CarOOP[10];
        for (int i = 0; i < myCarOOP.length; i++) {
            myCarOOP[i] = new CarOOP();
        }

        System.out.println("Reporting...");

        while (true) {
            System.out.println("Which car would you like to use? (Choose from 1-10)");
            int chosenCar = s.nextInt();
            int chosenCarIndex = chosenCar - 1;
            System.out.println("Input: " + chosenCar);
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("1: Turn the ignition on/off");
            System.out.println("2: Change the position of car");
            System.out.println("Q: Quit this program");
            char choice = s.next().charAt(0);
            System.out.println("Input: " + choice);
            switch (choice) {
                case '1':
                    myCarOOP[chosenCarIndex].ignitionSwitch();
                    break;
                case '2':
                    System.out.println("In which direction do you want to move the car?");
                    System.out.println("H: Horizontal");
                    System.out.println("V: Vertical");
                    System.out.print("Direction: ");
                    char horizontalOrVertical = s.next().charAt(0);
                    int distanceToMove;
                    switch (horizontalOrVertical) {
                        case 'H':
                            System.out.print("Enter a movement distance: ");
                            distanceToMove = s.nextInt();
                            myCarOOP[chosenCarIndex].moveHorizontally(distanceToMove);
                            break;
                        case 'V':
                            System.out.print("Enter a movement distance: ");
                            distanceToMove = s.nextInt();
                            myCarOOP[chosenCarIndex].moveVertically(distanceToMove);
                            break;
                        default:
                            System.out.println("You have entered an incorrect option. Please try again.");
                            break;

                    }

                    break;
                case 'Q':
                    System.exit(0);
                    break;
                default:
                    System.out.println("You have entered an incorrect option. Please try again.");
                    break;
            }
            reportState(chosenCar, myCarOOP[chosenCarIndex]);
        }

    }

    private static void reportState(int carNumber, CarOOP currentCarOOP) {
        int carIndex = carNumber - 1;
        System.out.println("Car Information");
        System.out.println("Car#: " + carNumber);
        String color;
        switch (currentCarOOP.getColor()) {
            case 'R':
                color = "Red";
                break;
            case 'G':
                color = "Green";
                break;
            case 'B':
                color = "Black";
                break;
            case 'W':
                color = "White";
                break;
            case 'S':
                color = "Silver";
                break;
            default:
                color = "Unknown";
                break;
        }
        System.out.println("Color: " + color);
        String ignitionState = currentCarOOP.getIgnition() ? "On" : "Off";
        System.out.println("Ignition: " + ignitionState);
        System.out.printf("Location: (%d, %d)\n", currentCarOOP.getXCoordinate(), currentCarOOP.getYCoordinate());
        for (int yPos = MIN; yPos <= MAX; yPos++) {
            for (int xPos = MIN; xPos <= MAX; xPos++) {
                if (xPos == currentCarOOP.getXCoordinate() && yPos == currentCarOOP.getYCoordinate()) {
                    System.out.printf("%s ", currentCarOOP.getColor());
                } else {
                    System.out.print("- ");
                }

            }
            System.out.println();
        }
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public boolean getIgnition() {
        return ignition;
    }

    public char getColor() {
        return color;
    }

    public void ignitionSwitch() {
        ignition = !ignition;
    }

    private int randomizePosition() {
        double x = (int) (Math.random() * ((MAX - MIN) + 1)) + MIN;
        return (int) x;
    }

    private void randomizeXCoordinate() {
        xCoordinate = randomizePosition();
    }

    private void randomizeYCoordinate() {
        yCoordinate = randomizePosition();
    }

//    private static boolean ignitionSwitch(boolean[] currentIgnitions, int carNumber) {
//        return currentIgnitions[carNumber] = !currentIgnitions[carNumber];
//    }

    private void assignColor() {
        char[] colors = {'R', 'G', 'B', 'W', 'S'};
        int randomNumber = new Random().nextInt(colors.length);
        color = colors[randomNumber];
    }

    public void moveHorizontally(int movementDistance) {
        xCoordinate = move(xCoordinate, movementDistance);
    }

    public void moveVertically(int movementDistance) {
        yCoordinate = move(yCoordinate, movementDistance);
    }

    private int move(int coordinate, int movementDistance) {
        if (!ignition) {
            System.out.println("The ignition is off. Please start the car.");
        } else if ((coordinate + movementDistance > MAX) || (coordinate + movementDistance < MIN)) {
            System.out.println("The value you have chosen to move would place the car outside of the grid. " +
                    "Please choose a different value.");
        } else {
            coordinate += movementDistance;
        }
        return coordinate;
    }
}

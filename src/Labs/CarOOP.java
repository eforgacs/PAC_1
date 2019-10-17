package Labs;

import java.util.Random;
import java.util.Scanner;

public class CarOOP {

    private static final int MIN = 1;
    private static final int MAX = 20;
    private static final int TOTAL_CARS = 10;
    private static Scanner s = new Scanner(System.in);

    private boolean[] ignitions = new boolean[TOTAL_CARS];
    private char[] colors = new char[TOTAL_CARS];
    private int[] xCoordinates = new int[TOTAL_CARS];
    private int[] yCoordinates = new int[TOTAL_CARS];

    public static void main(String[] args) {
        CarArrays myCarArrays = new CarArrays();
        for (int i = 0; i < myCarArrays.colors.length; i++) {
            myCarArrays.colors[i] = assignColor();
        }
        for (int i = 0; i < myCarArrays.xCoordinates.length; i++) {
            myCarArrays.xCoordinates[i] = randomizePosition();
        }
        for (int i = 0; i < myCarArrays.yCoordinates.length; i++) {
            myCarArrays.yCoordinates[i] = randomizePosition();
        }

        System.out.println("Reporting...");

        while (true) {
            System.out.println("Which car would you like to use? (Choose from 1-10)");
            int chosenCar = s.nextInt();
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
                    ignitionSwitch(myCarArrays.ignitions, chosenCar - 1);
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
                            myCarArrays.xCoordinates[chosenCar - 1] = myCarArrays.moveHorizontally(distanceToMove, chosenCar-1);
                            break;
                        case 'V':
                            System.out.print("Enter a movement distance: ");
                            distanceToMove = s.nextInt();
                            myCarArrays.yCoordinates[chosenCar - 1] = myCarArrays.moveVertically(distanceToMove, chosenCar - 1);
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
            reportState(chosenCar, myCarArrays);
        }

    }

    private static int randomizePosition() {

        double x = (int) (Math.random() * ((MAX - MIN) + 1)) + MIN;
        return (int) x;
    }

    private static char assignColor() {
        char[] colors = {'R', 'G', 'B', 'W', 'S'};
        int randomNumber = new Random().nextInt(colors.length);
        return colors[randomNumber];
    }

    private static boolean ignitionSwitch(boolean[] currentIgnitions, int carNumber) {
        return currentIgnitions[carNumber] = !currentIgnitions[carNumber];
    }

    private int moveHorizontally(int movementDistance, int carNumber) {
        return xCoordinates[carNumber] = move(xCoordinates[carNumber], movementDistance, carNumber);
    }

    private int moveVertically(int movementDistance, int carNumber) {
        return yCoordinates[carNumber] = move(yCoordinates[carNumber], movementDistance, carNumber);
    }

    private int move(int coordinate, int movementDistance, int carNumber) {
        if (!ignitions[carNumber]) {
            System.out.println("The ignition is off. Please start the car.");
        } else if ((coordinate + movementDistance > MAX) || (coordinate + movementDistance < MIN)) {
            System.out.println("The value you have chosen to move would place the car outside of the grid. " +
                    "Please choose a different value.");
        } else {
            coordinate += movementDistance;
        }
        return coordinate;
    }

    private static void reportState(int carNumber, CarArrays currentCarArrays) {
        int carIndex = carNumber - 1;
        System.out.println("Car Information");
        System.out.println("Car#: " + carNumber);
        String color;
        switch (currentCarArrays.colors[carIndex]) {
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
        String ignitionState = currentCarArrays.ignitions[carIndex - 1] ? "On" : "Off";
        System.out.println("Ignition: " + ignitionState);
        System.out.printf("Location: (%d, %d)\n", currentCarArrays.xCoordinates[carIndex], currentCarArrays.yCoordinates[carIndex]);
        for (int yPos = MIN; yPos <= MAX; yPos++) {
            for (int xPos = MIN; xPos <= MAX; xPos++) {
                if (xPos == currentCarArrays.xCoordinates[carIndex] && yPos == currentCarArrays.yCoordinates[carIndex]) {
                    System.out.printf("%s ", currentCarArrays.colors[carIndex]);
                } else {
                    System.out.print("- ");
                }

            }
            System.out.println();
        }
    }
}

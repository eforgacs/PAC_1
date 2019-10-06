import java.util.Random;
import java.util.Scanner;

public class Car {
    static final int MIN = 1;
    static final int MAX = 20;
    public static boolean ignition = false;
    public static char color;
    public static int xCoordinate;
    public static int yCoordinate;
    static Scanner s = new Scanner(System.in);


    public static void main(String[] args) {
        assignColor();
        xCoordinate = randomizePosition();
        yCoordinate = randomizePosition();

        System.out.println("Reporting...");

        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1: turn the ignition on/off");
            System.out.println("2: change the position of car");
            System.out.println("Q: quit this program");
            char choice = s.next().charAt(0);
            System.out.println("Input: " + choice);
            switch (choice) {
                case '1':
                    ignitionSwitch();
                    break;
                case '2':
                    System.out.println("In which direction do you want to move the car?");
                    System.out.println("H: Horizontal");
                    System.out.println("V: Vertical");
                    System.out.print("Direction: ");
                    char horizontalOrVertical = s.next().charAt(0);
                    int distanceToMove = 0;
                    switch (horizontalOrVertical) {
                        case 'H':
                            System.out.print("Enter a movement distance: ");
                            distanceToMove = s.nextInt();
                            moveHorizontally(distanceToMove);
                            break;
                        case 'V':
                            System.out.print("Enter a movement distance: ");
                            distanceToMove = s.nextInt();
                            moveVertically(distanceToMove);
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
            reportState();
        }

    }

    public static int randomizePosition() {

        double x = (int) (Math.random() * ((MAX - MIN) + 1)) + MIN;
        return (int) x;
    }

    public static char assignColor() {
        char[] colors = {'R', 'G', 'B', 'W', 'S'};
        int randomNumber = new Random().nextInt(colors.length);
        return Car.color = colors[randomNumber];
    }

    public static boolean ignitionSwitch() {
        return ignition = !ignition;
    }

    public static int moveHorizontally(int movementDistance) {
        return xCoordinate = move(xCoordinate, movementDistance);
    }

    public static int moveVertically(int movementDistance) {
        return yCoordinate = move(yCoordinate, movementDistance);
    }

    public static int move(int coordinate, int movementDistance) {
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

    public static void reportState() {

        System.out.println("Car Information");
        String color = "";
        switch (Car.color) {
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
        String ignitionState = ignition ? "On" : "Off";
        System.out.println("Ignition: " + ignitionState);
        System.out.printf("Location: (%d, %d)\n", xCoordinate, yCoordinate);
        for (int yPos = MIN; yPos <= MAX; yPos++) {
            for (int xPos = MIN; xPos <= MAX; xPos++) {
                if (xPos == xCoordinate && yPos == yCoordinate) {
                    System.out.printf("%s ", Car.color);
                } else {
                    System.out.print("- ");
                }

            }
            System.out.println();
        }
    }
}

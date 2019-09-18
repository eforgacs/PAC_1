package Labs;
// PAC 1: Week 2 Assignment
// TimeDifference.java

import java.util.Scanner;

public class TimeDifference {

    private static final int SECONDS_IN_HOUR = 3600;
    private static final int SECONDS_IN_MINUTE = 60;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstTimeTotalSeconds = getTimeInputFromUser(input, "Enter first time: ");
        int secondTimeTotalSeconds = getTimeInputFromUser(input, "Enter second time: ");

        int differenceInSeconds = firstTimeTotalSeconds - secondTimeTotalSeconds;
        int secondsDifference = differenceInSeconds % 60;
        int minutesDifference = differenceInSeconds / 60 % 60;
        int hoursDifference = (differenceInSeconds / 60) / 60;

        int paddedHours = hoursDifference * 10000;
        int paddedMinutes = minutesDifference * 100;

        int combinedTime = paddedHours + paddedMinutes + secondsDifference;
        System.out.println("Time difference: " + combinedTime);


    }

    private static int getTimeInputFromUser(Scanner input, String s) {
        System.out.print(s);
        return getTimeTotalSeconds(input);
    }

    private static int getTimeTotalSeconds(Scanner input) {
        int inputTime = input.nextInt();
        int inputTimeSeconds = getInitialTimeSeconds(inputTime);
        int inputTimeMinutes = getInitialTimeMinutes(inputTime, inputTimeSeconds);
        int inputTimeHours = getInitialTimeHours(inputTime, inputTimeSeconds, inputTimeMinutes);
        int inputTimeMinutesInSeconds = minutesToSeconds(inputTimeMinutes);
        int inputTimeHoursInSeconds = hoursToSeconds(inputTimeHours);
        return inputTimeSeconds + inputTimeMinutesInSeconds + inputTimeHoursInSeconds;
    }


    private static int getInitialTimeHours(int initialTime, int initialTimeSeconds, int firstTimeMinutes) {
        return (initialTime - (firstTimeMinutes * 100) - initialTimeSeconds) / 10000;
    }

    private static int getInitialTimeMinutes(int initialTime, int initialTimeSeconds) {
        return ((initialTime % 10000) - initialTimeSeconds) / 100;
    }

    private static int getInitialTimeSeconds(int initialTime) {
        return initialTime % 100;
    }


    private static int minutesToSeconds(int minutes) {
        return minutes * SECONDS_IN_MINUTE;
    }

    private static int hoursToSeconds(int hours) {
        return hours * SECONDS_IN_HOUR;
    }
}
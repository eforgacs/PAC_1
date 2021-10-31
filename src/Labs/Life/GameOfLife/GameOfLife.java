package Labs.Life.GameOfLife;

import java.util.Scanner;
import java.io.*;

public class GameOfLife {

    private static final int M = 25;
    private static final int N = 75;
    private static final int BORDER = 2;

    public static void main(String[] args) {


        int genNum = 0;
        boolean done = false;
        String input;

        char[][] newGen = new char[M + BORDER][N + BORDER];
        char[][] oldGen = new char[M + BORDER][N + BORDER];
        char[][] world = new char[M + BORDER][N + BORDER];

        Scanner consoleReader = new Scanner(System.in);
        System.out.print("Which file would you like to open? (use full path)");
        String filename = consoleReader.next();
        File file = new File(filename);
        Scanner fileStringReader = null;

        try {
            fileStringReader = new Scanner(file);
        } catch (Exception e) {
            System.out.println("file " + file + " does not exist.");
            quit();
        }


        System.out.println("Generation number: " + genNum);
        for (int i = 1; i <= M; i++) {

            assert fileStringReader != null;
            String line = fileStringReader.nextLine();

            char[] lineAsChar = line.toCharArray();

            for (int j = 1; j <= N; j++) {

                world[i][j] = lineAsChar[j - 1];
                System.out.print(world[i][j]);

            }

            System.out.println();
        }


        while (!done) {
            System.out.println("Choose what you would like to do: ");
            System.out.println("y: Continue");
            System.out.println("n: Quit");

            input = consoleReader.next();

            switch (input) {
                case "y":

                    if (isEmptyWorld(world)) {
                        System.out.println("Your world has died.");
                        quit();
                    } else {
                        int numberOfNeighbors;

                        for (int i = 1; i <= M; i++) {
                            for (int j = 1; j <= N; j++) {
                                int[] cell_coordinate = {i, j};


                                numberOfNeighbors = getNumberOfNeighbors(world, cell_coordinate);

                                if (world[i][j] == 'X') {
                                    if (numberOfNeighbors == 2 || numberOfNeighbors == 3) {
                                        newGen[i][j] = world[i][j];
                                    } else {
                                        newGen[i][j] = '.';
                                    }
                                } else {
                                    if (numberOfNeighbors == 3) {
                                        newGen[i][j] = 'X';
                                    } else {
                                        newGen[i][j] = '.';
                                    }
                                }

                            }
                        }

                        genNum++;

                        for (int i = 1; i <= M; i++) {
                            // Manual array copy. Could be done more efficiently by using:
                            // System.arraycopy(world[i], 1, oldGen[i], 1, N);
                            for (int j = 1; j <= N; j++) {
                                oldGen[i][j] = world[i][j];
                            }
                        }

                        for (int i = 1; i <= M; i++) {
                            // Manual array copy. Could be done more efficiently by using:
                            // System.arraycopy(newGen[i], 1, world[i], 1, N);
                            for (int j = 1; j <= N; j++) {
                                world[i][j] = newGen[i][j];
                            }
                        }

                        printWorld(world, genNum);

                        if (genNum > 0) {
                            if (isSameWorld(oldGen, newGen)) {
                                System.out.println("The new generation is the same as the old one.");
                                quit();
                            }
                        }


                    }
                    break;
                case "n":
                    done = true;
                    break;
                default:
                    System.out.println("Please enter valid input.");

            }

        }

        consoleReader.close();

    }

    private static void quit() {
        System.out.println("Quitting program...");
        System.exit(0);
    }

    private static int getNumberOfNeighbors(char[][] world, int[] cell_coordinate) {

        int x = cell_coordinate[0];
        int y = cell_coordinate[1];

        int neighborCount = 0;


        if (world[x - 1][y] == 'X')
            neighborCount++;
        if (world[x - 1][y + 1] == 'X')
            neighborCount++;
        if (world[x - 1][y - 1] == 'X')
            neighborCount++;

        if (world[x][y - 1] == 'X')
            neighborCount++;
        if (world[x][y + 1] == 'X')
            neighborCount++;

        if (world[x + 1][y] == 'X')
            neighborCount++;
        if (world[x + 1][y + 1] == 'X')
            neighborCount++;
        if (world[x + 1][y - 1] == 'X')
            neighborCount++;


        return neighborCount;
    }

    private static boolean isEmptyWorld(char[][] world) {

        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++) {
                if (world[i][j] == 'X')
                    return false;
            }
        }

        return true;
    }

    private static void printWorld(char[][] world, int generationNumber) {
        System.out.println("Generation number: " + generationNumber);

        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(world[i][j]);

            }
            System.out.println();
        }

    }

    private static boolean isSameWorld(char[][] oldGen, char[][] newGen) {

        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++) {
                if (oldGen[i][j] != newGen[i][j])
                    return false;
            }
        }

        return true;
    }
}
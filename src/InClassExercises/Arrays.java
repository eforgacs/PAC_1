package InClassExercises;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
//        int studentGrades[] = new int[10];
//
//        //grade at 1
//        int studentAtOne = studentGrades[1];

//        final int NUM_STUDENTS = 10;

//        int[] studentIDs;
//
//        Scanner s = new Scanner(System.in);
//
//        int numStudents = s.nextInt();
//
//        studentIDs = new int[numStudents];
//
//        for (int i = 0; i < numStudents; i++) {
//            studentIDs[i] = i + 1;
//            System.out.println("Added student with ID: " + studentIDs[i]);
//        }

//        studentIDs[ 0 ] = 1;
//        studentIDs[ 1 ] = 2;
//        studentIDs[ 2 ] = 3;

        // pass by value
//        int i = 0;
//
//        changeInt(i);
//
//        System.out.println( "i: " + i);
//
//        int[] numbers = new int[8];
//
//    }
//
//    public static void changeInt( int a) {
//        a += 5;
//    }
//
//    public static void changeArray(int[] array){
//        for( int i = 0; i < array.length; i++){
//            array[i] += 5;

        char[][] ticTacToe = {
                {' ', 'x', ' '},
                {'o', 'x', ' '},
                {' ', 'x', 'o'}
        };

        for (int i = 0; i < ticTacToe.length; i++) {
            for (int j = 0; j < ticTacToe[i].length; j++) {
                System.out.print(ticTacToe[i][j]);
            }
            System.out.println();
        }
    }
}

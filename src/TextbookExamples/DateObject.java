package TextbookExamples;

public class DateObject {

    public static void main(String[] args) {
        long elapsedTime = 10000;
        java.util.Date myDate = new java.util.Date(elapsedTime);
        String myDateString = myDate.toString();
        System.out.println(myDateString);
//        10000, 100000, 1000000, 10000000, 100000000, 1000000000,
//10000000000, and 100000000000
    }
    public void setElapsedTime(long elapsedTime){

    }
}

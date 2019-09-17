package TextbookExamples;

public class ApproximatePi {
    public static void main(String[] args) {
        //System.out.println(4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13)));
        long iters = 999999999999999999L;
        double pi = 0;
        long bound = 1_000_000_000;
        for(long i = 0, denominator = 1; i < iters; i++, denominator+=2) {
            double numerator = (i % 2 != 0) ? -1:1;
            double operand = numerator / denominator;
            pi += operand;
            if (i % bound == 0) {
                System.out.println(i / bound + "B calculations");
                double temppi = pi * 4;
                System.out.println(temppi);
                System.out.println(Math.PI);
            }
        }
        pi *= 4;
        System.out.println(pi);
        System.out.println(Math.PI);
    }
}

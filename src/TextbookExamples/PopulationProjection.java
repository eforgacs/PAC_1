package TextbookExamples;

public class PopulationProjection {
    private static long current_population = 312_032_486;
    private static final int days_in_a_year = 365;
    private static final int births_per_second = 7;
    private static final int deaths_per_second = 13;
    private static final int immigrants_per_second = 45;

    private static void annualPopulationGrowth() {
        long seconds_per_year = days_in_a_year*24*60*60;
        long births = births_per_second * seconds_per_year;
        long deaths = deaths_per_second * seconds_per_year;
        long immigrants = immigrants_per_second * seconds_per_year;
        current_population = current_population + births;
        current_population = current_population - deaths;
        current_population = current_population + immigrants;
    }

    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            annualPopulationGrowth();
            System.out.println(current_population);
        }
    }
}

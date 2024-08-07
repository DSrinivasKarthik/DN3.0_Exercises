public class FinancialForecasting {

    public static double predictFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        double nextValue = currentValue * (1 + growthRate);
        return predictFutureValue(nextValue, growthRate, years - 1);
    }

    public static void main(String[] args) {
        double currentValue = 1000.0; 
        double growthRate = 0.10; 
        int years = 5; 

        double futureValue = predictFutureValue(currentValue, growthRate, years);
        System.out.printf("Predicted future value after %d years: %.2f\n", years, futureValue);
    }
}

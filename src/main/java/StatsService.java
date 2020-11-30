public class StatsService {

    StatsService servise = new StatsService();

    public int calculateSum(int[] months) {
        int sum = 0;
        for ( int month : months ) {
            sum = month + sum;
        }
        return sum;
    }

    public double calculateAverageSum(int[] months) {
        double average = 0;

        int sum = servise.calculateSum(months);
        average = sum / 12;
        return average;
    }

    public int calculateMaxSum(int[] months) {
        int max = months[0];
        for ( int month : months ) {
            if (max < month) {
                max = month;
            }
        }
        return max;
    }

    public int calculateMaxMin(int[] months) {
        int min = months[0];
        for ( int month : months ) {
            if (min > month) {
                min = month;
            }
        }
        return min;
    }


    public int calculateAverageSumUnder(int[] months) {
        int under = 0;
        int sum = 0;
        double average = servise.calculateAverageSum(months);
        for ( int month : months ) {
            if (month < average) {
                under = under + 1;
            }
        }
        return under;
    }

    public int calculateAverageSumOver(int[] months) {
        int over = 0;
        int sum = 0;
        double average = servise.calculateAverageSum(months);
        for ( int month : months ) {
            if (month > average) {
                over = over + 1;
            }
        }
        return over;
    }
}



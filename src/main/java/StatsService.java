public class StatsService {



    public int calculateSum(int[] months) {
        int sum = 0;
        for ( int month : months ) {
            sum = month + sum;
        }
        return sum;
    }

    public double calculateAverageSum(int[] months) {
        double average = 0;
        int sum = 0;
        for ( int month : months ) {
            sum = month + sum;
            average = sum / 12;
        }
        return average;
    }

    public int calculateMaxSum(int[] months) {
        int max = months[0];
        for ( int month : months ) {
            if (max < month ){
                max = month;
            }
        }
        return max;
    }

    public int calculateMaxMin(int[] months) {
        int min = months [0];
        for ( int month : months ) {
           if (min > month) {
           min = month;}
           }
        return min;
    }



    public int calculateAverageSumUnder(int[] months) {
        int under = 0;
        for ( int month : months ) {
            int sum = 0;
            sum = month + sum;
            double average = sum / 12;
            if (sum < average) {
                under = under + 1;
            }
        }
        return under;
    }

    public int calculateAverageSumOver(int[] months) {
        int over = 0;
        for ( int month : months ) {
            int sum = 0;
            sum = month + sum;
            double average = sum / 12;
            if (sum > average) {
                over = over + 1;
            }
        }
        return over;
    }
}



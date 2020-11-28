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
        int under = 0; // создаем переменную записывать в нее будем количество месяцев, где псумма была больше средней
        int sum = 0;
        for ( int month : months ) {
            sum = month + sum;
        } // считаем общую сумму
        double average = sum / 12; // делим общую сумму на 12 что бы узнать среднюю сумму, получаем 15
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
        for ( int month : months ) {
            sum = month + sum;
        }
        double average = sum / 12;
        for ( int month : months ) {
            if (month > average) {
                over = over + 1;
            }
        }
        return over;
    }
}



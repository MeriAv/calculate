import org.junit.jupiter.api.Test;

import javax.enterprise.inject.New;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {


    @Test
    void snouldCalculateSum() {
        StatsService service = new StatsService();
        int expected = 180;
        int[] months;
        int actual = service.calculateSum(months = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        assertEquals(expected, actual);
    }

    @Test
    void snoulCalculateAverageSum() {
        StatsService service = new StatsService();
        int expected = 15;
        int[] months;
        double actual = service.calculateAverageSum(months = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        assertEquals(expected, actual);
    }

    @Test
    void snoulCalculateMaxSum() {
        StatsService service = new StatsService();
        int expected = 20;
        int[] months;
        int actual = service.calculateMaxSum(months = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        assertEquals(expected, actual);
    }

    @Test
    void snoulCalculateMaxMin() {
        StatsService service = new StatsService();
        int expected = 7;
        int[] months;
        int actual = service.calculateMaxMin(months = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        assertEquals(expected, actual);
    }

    @Test
    void snoulCalculateAverageSumUnder() {
        StatsService service = new StatsService();
        int expected = 5;
        int[] months;
        int actual = service.calculateAverageSumUnder(months = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        assertEquals(expected, actual);
    }


    @Test
    void snoulCalculateAverageSumOver() {
        StatsService service = new StatsService();
        int expected = 5;
        int[] months;
        int actual = service.calculateAverageSumOver(months = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        assertEquals(expected, actual);
    }
}
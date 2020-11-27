import org.junit.jupiter.api.Test;

import javax.enterprise.inject.New;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {


    @Test
    void snouldCalculateSum(int[] months) {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.calculateSum(months = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        assertEquals(expected, actual);
    }

    @Test
    void snoulCalculateAverageSum(int[] months) {
        StatsService service = new StatsService();
        int expected = 15;
        double actual = service.calculateSum(months = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        assertEquals(expected, actual);
    }

    @Test
    void snoulCalculateMaxSum(int[] months) {
        StatsService service = new StatsService();
        int expected = 20;
        int actual = service.calculateSum(months = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        assertEquals(expected, actual);
    }

    @Test
    void snoulCalculateMaxMin(int[] months) {
        StatsService service = new StatsService();
        int expected = 7;
        int actual = service.calculateSum(months = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        assertEquals(expected, actual);
    }

    @Test
    void snoulCalculateAverageSumUnder(int[] months) {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.calculateSum(months = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        assertEquals(expected, actual);
    }


    @Test
    void snoulCalculateAverageSumOver(int[] months) {
        StatsService service = new StatsService();
        int expected = 7;
        int actual = service.calculateSum(months = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        assertEquals(expected, actual);
    }
}
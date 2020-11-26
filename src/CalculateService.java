public class CalculateService {
    int[] mouths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int sum = 0;
    public int calculateSum() {
        for ( int mouth: mouths) {
            sum = mouth + sum;
        }
        return sum;
    }
}

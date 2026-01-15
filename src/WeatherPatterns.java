/**
 * The class WeatherPatterns finds the longest span of days in which
 * each day’s temperature is higher than on the previous day in that sequence.
 *
 * @author Zach Blick
 * @author Logan Tran
 */

public class WeatherPatterns {


    /**
     * Longest Warming Trend
     * @param temperatures
     * @return the longest run of days with increasing temperatures
     */
    public static int longestWarmingTrend(int[] temperatures) {
        // TODO: Write your code here!
        int n = temperatures.length;
        if(n == 0) {
            return 0;
        }
        int[] lengths = new int[n];

        for(int i = 0; i < n; i++) {
            lengths[i] = 1;
        }

        int counter = 1;
        // test if each length is the highest seen yet
        for(int i = 0; i < n; i++) {

        }




        return counter;
    }
}

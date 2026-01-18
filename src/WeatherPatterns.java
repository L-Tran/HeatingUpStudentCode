import java.util.ArrayList;

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

    public static ArrayList<Integer>[] list;
    public static int[] paths;

    public static int longestWarmingTrend(int[] temperatures) {
        // Initialize array
        list = new ArrayList[temperatures.length];
        for(int i = 0; i < temperatures.length; i++) {
            list[i] = new ArrayList<Integer>();
            // Add each possible path from a temp to it's arraylist
            for(int j = 0; j < i; j++) {
                if(temperatures[j] < temperatures[i]) {
                    list[i].add(j);
                }
            }
        }

        // Initialize paths to store length before reaching each temp
        paths = new int[temperatures.length];

        // Find maxLength using recursion
        int maxLength = 0;
        for(int i = 0; i < temperatures.length; i++) {
            maxLength = Math.max(maxLength, LongestPathTo(i, 0));
        }

        return maxLength;
    }

    public static int LongestPathTo(int index, int len) {
        // Use paths to shorten recursion
        if(paths[index] != 0) {
            return paths[index];
        }

        // Add up path length for each temp
        for (int i = 0; i < list[index].size(); i++) {
            len = Math.max(len, LongestPathTo(list[index].get(i), len));
        }

        // Set path length
        paths[index] = len + 1;
        return paths[index];
    }
}

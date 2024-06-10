

class Solution {
    public int heightChecker(int[] heights) {
        int dontMatch = 0;
        int[] expected = Arrays.copyOf(heights, heights.length); // Create a copy of the heights array
        Arrays.sort(expected); // Sort the expected array
        for (int i = 0; i < heights.length; i++) { // Use heights.length as property
            if (heights[i] != expected[i]) dontMatch++;
        }
        return dontMatch;
    }
}

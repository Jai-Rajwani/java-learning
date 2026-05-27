package solutions;

public class TrappingRainwater {
    public int trap(int[] height) {
        if (height.length < 3) {
            return 0;
        }
        int totalWater = 0;
        // pointers
        int left = 0;
        int right = height.length - 1;
        // heights
        int leftMaxHeight = height[left];
        int rightMaxHeight = height[right];

        while (right - left > 0) {
            if (height[left] <= height[right]) {
                totalWater += getCurrentVolume(leftMaxHeight, height[left]);
                leftMaxHeight = Math.max(leftMaxHeight, height[left]);
                left++;
            } else {
                totalWater += getCurrentVolume(rightMaxHeight, height[right]);
                rightMaxHeight = Math.max(rightMaxHeight, height[right]);
                right--;
            }
        }
        return totalWater;
    }

    private int getCurrentVolume(int smallestMaximum, int currentHeight) {
        return Math.max(smallestMaximum - currentHeight, 0);
    }
}

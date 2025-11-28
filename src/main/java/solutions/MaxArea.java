package solutions;

public class MaxArea {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;
        while (right > left) {
            int currentArea = getArea(left, right, height);
            area = Math.max(area, currentArea);
            if (height[right] >= height[left]) {
                left++;
            } else {
                right--;
            }
        }
        return area;
    }
    private int getArea(int startIndex, int endIndex, int[] heightArray) {
        return (endIndex - startIndex) * Math.min(heightArray[startIndex], heightArray[endIndex]);
    }
}

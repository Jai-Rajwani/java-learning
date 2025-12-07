package solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length < 1) return 0;
        if (nums.length == 1) return 1;

        int currentCounter = 0;
        int maxCounter = 0;

        Set<Integer> numSet = new HashSet<>(Arrays.stream(nums).boxed().toList());
        for (int i = 0; i <= nums.length; i++) {
            if (numSet.contains(nums[i] - 1)) {continue;}
            if (numSet.contains(nums[i] + 1)) {
                for (int j = 0; j <= nums.length; j++) {

                }
            }
        }




        return maxCounter;
    }

    private int getSmallestElement(int[] nums) {
        int smallest = 10^9;
        for (int num : nums) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }

    private int getLargestElement(int[] nums) {
        int largest = -10^9;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }
}

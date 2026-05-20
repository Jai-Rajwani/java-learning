package solutions;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }

        int longestConsecutiveSequence = 0;
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        for (int num : set) {
            if (set.contains(num - 1)) {
                continue;
            }
            int currentSequence = getCurrentSequenceLength(set, num);
            longestConsecutiveSequence = Math.max(longestConsecutiveSequence, currentSequence);
        }
        return longestConsecutiveSequence;
    }

    private int getCurrentSequenceLength(Set<Integer> set, int currentNum) {
        int smallest = currentNum;
        int currentSequenceLength = 0;
        while (set.contains(smallest)) {
            currentSequenceLength++;
            smallest++;
        }
        return currentSequenceLength;
    }
}

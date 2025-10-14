package solutions;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // map to store elements of nums as keys and their index as values
        Map<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[2];

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int j = 0; j < nums.length; j++) {
            int difference = target - nums[j];
            if (map.containsKey(difference) && j != map.get(difference)) {
                answer[0] = j;
                answer[1] = map.get(difference);
                break;
            }
        }
        return answer;
    }
}

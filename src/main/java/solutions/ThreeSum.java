package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] input = {2,-3,0,-2,-5,-5,-4,1,2,-2,2,0,2,-4,5,5,-10};
        List<List<Integer>> output = threeSum(input);
        System.out.println(output);
    }


    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int leftPointer = i + 1;
            int rightPointer = nums.length - 1;
            while (leftPointer < rightPointer) {
                if (nums[i] + nums[leftPointer] + nums[rightPointer] == 0) {
                    answer.add(Arrays.asList(nums[i], nums[leftPointer], nums[rightPointer]));
                    leftPointer++;
                } else if (nums[i] + nums[leftPointer] + nums[rightPointer] < 0) {
                    leftPointer++;
                } else {
                    rightPointer--;
                }
            }
        }
        for (int i = 1; i < answer.size(); i++) {
            if (answer.get(i).equals(answer.get(i -1))) {
                answer.remove(i);
                i--;
            }
        }
        return answer;
    }
}

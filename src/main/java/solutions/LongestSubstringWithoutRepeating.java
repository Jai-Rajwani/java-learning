package solutions;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        if (length == 0)
            return 0;
        if (length == 1)
            return 1;

        int left = 0;
        int right = 1;
        int maxLength = 0;
        Map<Character, Integer> characterAndPositionMap = new HashMap<>();
        characterAndPositionMap.put(s.charAt(left), left);

        while (left < right && right < length) {
            char currentChar = s.charAt(right);
            if (characterAndPositionMap.containsKey(currentChar)) {
                maxLength = Math.max(maxLength, right - left);
                left = characterAndPositionMap.get(currentChar) + 1;
                characterAndPositionMap.clear();
                characterAndPositionMap.put(s.charAt(left), left);
                right = left + 1;
            } else {
                characterAndPositionMap.put(currentChar, right);
                right++;
            }
            maxLength = Math.max(maxLength, right - left);
        }
        return maxLength;
    }
}

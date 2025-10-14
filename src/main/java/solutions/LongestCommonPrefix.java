package solutions;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String firstString = strs[0];
        String largestPrefix = "";
        if (strs.length == 1) return strs[0];
        for (int i = 0; i < firstString.length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                String substring = firstString.length() > 1 ? firstString.substring(0,i) : firstString;
                if (strs[j].startsWith(substring)) {
                    largestPrefix = substring;
                } else if (i > 0 && strs[j].startsWith(firstString.substring(0, i - 1))) {
                    largestPrefix = firstString.substring(0, i -1);
                    return largestPrefix;
                } else {
                    largestPrefix = "";
                }
            }
        }
        return largestPrefix;
    }
}

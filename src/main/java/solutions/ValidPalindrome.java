package solutions;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String cleanedInput = cleanTheInput(s);
        int cleanedInputLength = cleanedInput.length();
        if (cleanedInputLength < 2)
            return true;

        for (int i = 0; i < cleanedInputLength / 2; i++) {
            if (cleanedInput.charAt(i) != cleanedInput.charAt(cleanedInputLength - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    private String cleanTheInput(String string) {
        string.replaceAll("[^a-zA-Z0-9]", "");
        return string.toLowerCase();
    }

}

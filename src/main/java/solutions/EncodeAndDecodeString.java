package solutions;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeString {
    private static final String DELIMITER = "$";
    public String encode(List<String> stringsList) {
        StringBuffer encodedString = new StringBuffer();
        for (String string : stringsList) {
            encodedString.append(string.length()).append(DELIMITER).append(string);
        }

        return encodedString.toString();
    }

    public List<String> decode(String encodedString) {
        List<String> decodedStringsList = new ArrayList<>();
        int cursor = 0;
        int startIndex = 0;
        int endIndex = 0;
        while (endIndex < encodedString.length()) {
                if (encodedString.charAt(cursor) == DELIMITER.charAt(0)) {
                    int length =Integer.parseInt(encodedString.substring(startIndex, cursor));
                    endIndex = cursor + length + 1;
                    String decodedString = encodedString.substring(cursor + 1, cursor + 1 + length);
                    decodedStringsList.add(decodedString);
                    startIndex = endIndex;
                    cursor = startIndex;
            } else {
                    cursor++;
                }
        }

        return decodedStringsList;
    }

}

package solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class ValidAnagram {
    boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i ++) {
            putOrIncreaseByOne(mapS, s.charAt(i));
            putOrIncreaseByOne(mapT, t.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            if (!Objects.equals(mapS.get(s.charAt(i)), mapT.get(s.charAt(i)))) {
                return false;
            }
        }

        return true;
    }

    private static void putOrIncreaseByOne(Map<Character, Integer> map, Character str) {
        if (map.containsKey(str)) {
            map.put(str, map.get(str) + 1);
        } else {
            map.put(str, 1);
        }
    }
}

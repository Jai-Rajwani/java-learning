package solutions;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if (strs.length == 1) {
          result.add(Arrays.asList(strs));
          return result;
        }
        Map<Map<Character, Integer>, List<String>> groupAnagramMap = new HashMap<>();
        for (String str : strs) {
            Map<Character, Integer> characterFrequencyMap = getCharacterFrequencyMap(str);
            if (!groupAnagramMap.containsKey(characterFrequencyMap)) {
                List<String> anagrams = new ArrayList<>();
                anagrams.add(str);
                groupAnagramMap.put(characterFrequencyMap, anagrams);
            } else {
                groupAnagramMap.get(characterFrequencyMap).add(str);
            }
        }

        result.addAll(groupAnagramMap.values());
        return result;
    }

    private Map<Character, Integer> getCharacterFrequencyMap(String string) {
        Map<Character, Integer> characterFrequencyMap = new HashMap<>();
        for (Character character : string.toCharArray()) {
            if (characterFrequencyMap.containsKey(character)) {
                characterFrequencyMap.put(character, characterFrequencyMap.get(character) + 1);
            } else {
                characterFrequencyMap.put(character, 1);
            }
        }
        return characterFrequencyMap;
    }
}

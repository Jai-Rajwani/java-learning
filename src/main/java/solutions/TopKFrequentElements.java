package solutions;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TopKFrequentElements {
    public int[] topKFrequentElements(int[] arr, int k) {
        Map<Integer, Integer> frequencyMap = getFrequencyMap(arr);
        List<Integer>[] frequencyBuckets = getFrequencyBuckets(frequencyMap, arr.length + 1);
        return getTopKFrequentElements(frequencyBuckets, k);
    }


    private static Map<Integer, Integer> getFrequencyMap(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int value : arr) {
            if (!frequencyMap.containsKey(value)) {
                frequencyMap.put(value, 1);
            } else {
                frequencyMap.put(value, frequencyMap.get(value) + 1);
            }
        }
        return frequencyMap;
    }

    private static List<Integer>[] getFrequencyBuckets(Map<Integer, Integer> frequencyMap, int size) {
        List<Integer>[] frequencyBuckets = new List[size];
        Set<Map.Entry<Integer, Integer>> entrySet = frequencyMap.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (frequencyBuckets[entry.getValue()] == null) {
                List<Integer> bucket = new ArrayList<>();
                bucket.add(entry.getKey());
                frequencyBuckets[entry.getValue()] = bucket;
            } else {
                frequencyBuckets[entry.getValue()].add(entry.getKey());
            }
        }
        return frequencyBuckets;
    }

    private static int[] getTopKFrequentElements(List<Integer>[] frequencyBuckets, int k) {
        List<Integer> answer = new ArrayList<>();
        int values = k;
        int iterator = frequencyBuckets.length - 1;
        while (values > 0 && answer.size() < k) {
            if (frequencyBuckets[iterator] != null) {
                answer.addAll(frequencyBuckets[iterator]);
                values--;
            }
            iterator--;
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}

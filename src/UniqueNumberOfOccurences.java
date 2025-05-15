import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurences {
    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1,2,2,1,1,3}));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> occurrences = new HashMap<>();

        for( int num : arr ) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> uniques = new HashSet<>();
        for (int num : occurrences.values()) {
            if (!uniques.add(num)) {
                return false;
            }
        }

        return true;
        
    }
}

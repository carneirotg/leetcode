import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDifferenceTwoArrays {
    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1,2,3}, new int[]{2,4,6}));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        

        HashSet<Integer> distinct1 = new HashSet<>();
        HashSet<Integer> distinct2 = new HashSet<>();

        HashSet<Integer> nums1Set = new HashSet<>();
        HashSet<Integer> nums2Set = new HashSet<>();
        
        for (int num : nums1) {
            nums1Set.add(num);
        }

        for (int num : nums2) {
            nums2Set.add(num);
            if (!nums1Set.contains(num)) {
                distinct2.add(num);
            }
        }

        for (int num : nums1) {
            if (!nums2Set.contains(num)) {
                distinct1.add(num);
            }
        }

        return List.of(new ArrayList<>(distinct1), new ArrayList<>(distinct2));

    }
}


public class PivotIndex {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1,7,3,6,5,6}) + " -> 3");
    }

    public static int pivotIndex(int[] nums) {

        int[] prefixArray = new int[nums.length];
        int[] suffixArray = new int[nums.length];

        prefixArray[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            prefixArray[i] = nums[i-1] + prefixArray[i-1];
        }

        suffixArray[nums.length-1] = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            suffixArray[i] = nums[i+1] + suffixArray[i+1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (suffixArray[i] == prefixArray[i]) {
                return i;
            }
        }

        return -1;
    }
}

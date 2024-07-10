public class SlicingQuestion {


    int longestOne(int[] array) {
        //search until find a one, set to begin
        //record the index and continue the loop until find a zero
        //record the longest
        int[] tmpArray = new int[array.length];
        int longest = Integer.MIN_VALUE;
        int index = 0;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                temp++;
            } else {
                tmpArray[index] = temp;
                longest = Math.max(longest, temp);
                temp = 0;
            }
        }
        return longest;
    }

    public static void main(String[] args) throws Exception {
        int len = new SlicingQuestion().longestOne(new int[]{0,1,1,0,1,0,0});
        System.out.println("len = " + len);
    }
}

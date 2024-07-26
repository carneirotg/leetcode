public class MoveZeroes {
    public static void main(String[] args) {
        
        moveZeroes(new int[]{0,1,0,3,12});
    }

    public static void moveZeroes(int[] nums) {
        
        int insertPos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertPos] = nums[i];
                insertPos++;
            }
       }

        for (int i = insertPos; i < nums.length; i++) {
            nums[i] = 0;
        
       }
       
    }
}

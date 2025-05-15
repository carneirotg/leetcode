import java.util.ArrayList;
import java.util.HashMap;

public class HouseRobber {
    public static void main(String[] args) {
        
        // System.out.println(rob(new int[]{1,2,3,1}));
        // System.out.println(rob(new int[]{2,7,9,3,1}));
        // System.out.println(rob(new int[]{1,2}));
        // System.out.println(rob(new int[]{1,3,1}));
        // System.out.println(rob(new int[]{2,1,1,2}));
        System.out.println(rob(new int[]{1,3,1,3,100}));
    }

    public static int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int prevRob = 0;
        int currRob = 0;

        for (int i = 0; i < nums.length; i++) {
            int temp = prevRob;
            prevRob = Math.max(prevRob, currRob);
            currRob = temp + nums[i];
        }

        return Math.max(prevRob, currRob);
        
    }
}

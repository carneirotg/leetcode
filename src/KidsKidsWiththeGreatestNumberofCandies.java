import java.util.ArrayList;
import java.util.List;

public class KidsKidsWiththeGreatestNumberofCandies {
    public static void main(String[] args) {
        
        int[] array = new int[]{2,3,5,1,3};
        System.out.println(kidsWithCandies(array, 3) + " expected: [true,true,true,false,true] ");
    }

     public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();

        int biggestNumber = 0;
        for (int i = 0; i < candies.length; i++) {
            int tmp = candies[i];
            if (tmp >= biggestNumber) {
                biggestNumber = tmp;
            }
        }

        for (int i = 0; i < candies.length; i++) {
            int tmp = candies[i];
            tmp += extraCandies;
            if ( tmp >= biggestNumber) {
                result.add(true);
                continue;
            }
            result.add(false);

        }

        return result;
    }
}

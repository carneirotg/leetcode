import java.util.HashMap;

/**
 * CanPlaceFlowers
 */
public class CanPlaceFlowers {

    public static void main(String[] args) {
        // System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1}, 1) + " expected: true");
        // System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1}, 2) + " expected: false");
        System.out.println(canPlaceFlowers(new int[]{0,0,1,0,0}, 1) + " expected: true");
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
    
        if (n == 0
        || (flowerbed.length == 1 && flowerbed[0] == 0)) {
            return true;
        }

        int amount = 0;
        HashMap<Integer, Boolean> placed = new HashMap<>();
        placed.put(0, flowerbed[0] == 1 ? true : false);

        if (flowerbed.length > 1) {
            if (flowerbed[0] == 0 && flowerbed[1] == 0) {
                amount += 1;
                placed.put(0, true);
            }
        }

        if (flowerbed.length > 1) {
            if (flowerbed[flowerbed.length-1] == 0 && flowerbed[flowerbed.length-2] == 0) {
                amount += 1;
                placed.put(flowerbed.length-1, true);
            }
        }
        
        
        for (int i = 1; i < flowerbed.length - 1; i++) {
            
            if (flowerbed[i] == 0
            && flowerbed[i - 1] == 0 
            && (flowerbed[i + 1] == 0 )
            && !placed.get(i-1) ) {
                placed.put(i, true);
                amount += 1;
                continue;
            }
            placed.put(i, flowerbed[i] == 1 ? true : false);

        }

        return amount == n;
    }
}
public class ProductsExceptSelf {
    
    public static void main(String[] args) {
        System.out.println(productExceptSelf(new int[]{1,2,3,4}) + " -> [24,12,8,6]");
    }

    public static int[] productExceptSelf(int[] nums) {
        
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] products = new int[nums.length];

        prefix[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        suffix[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            products[i] = prefix[i] * suffix[i];
        }

        return products;
    }
}

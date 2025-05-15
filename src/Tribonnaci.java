import java.util.HashMap;

public class Tribonnaci {

    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }

    public static int tribonacci(int n) {
        HashMap<Integer, Integer> memo = new HashMap<>();

        return tribi(n, memo);
    }

    public static int tribi(int n, HashMap<Integer, Integer> memo) {
        if (n == 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        if (!memo.containsKey(n)) {
            memo.put(n, tribi(n-3, memo) + tribi(n-2, memo) + tribi(n-1, memo));
        }

        return memo.get(n);
    }
}

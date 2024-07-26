import java.util.HashMap;

public class IsSubsequence {
    
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        if (sLength == 0) {
            return true;
        }

        if (tLength == 0 || (sLength > tLength)) {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        int sIndex = 0;

        for (int i = 0; i < tLength; i++) {
            if (sArray[sIndex] == tArray[i]) {
                sIndex++;
            }
        }

        return sIndex == sLength;
        
    }
}

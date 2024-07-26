import java.util.HashSet;
import java.util.List;

public class ReverseVowelsOfString {
    public static void main(String[] args) {

        // System.out.println(reverseString("race car") + " expected race car");
        System.out.println(reverseString("leetcode") + " expected leotcede");
        // System.out.println(reverseString("Aa") + " expected aA");
        
    }

    public static String reverseString(String s) {
        List<Character> vowels = List.of('A','a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u');
        HashSet<Character> vowelsSet = new HashSet<>(vowels);

        char[] charArray = s.toCharArray();

        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char leftTmp = charArray[left];
            if (!vowelsSet.contains(leftTmp)) {
                left += 1;
                continue;
            }

            char rightTmp = charArray[right];
            if (!vowelsSet.contains(rightTmp)) {
                right -= 1;
                continue;
            }

            //swap
            char tmp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = tmp;
            left += 1;
            right -= 1;
            

            
        }

        return String.valueOf(charArray);
    }
    
}

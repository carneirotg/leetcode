import java.util.HashMap;

public class GreatestCommonDivisorofStrings {
    public static void main(String[] args) {

        System.out.println(gcdOfStrings("TAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX") + " expected: " + "TAUXX");
        System.out.println(gcdOfStrings("ABABABAB", "ABAB") + " expected: " + "ABAB");
        System.out.println(gcdOfStrings("ABCABC", "ABC") + " expected: " + "ABC");
        System.out.println(gcdOfStrings("ABABAB", "ABAB") + " expected: " + "AB");
        System.out.println(gcdOfStrings("ABCDEF", "ABC") + " expected: " + " ");
    }

    public static String gcdOfStrings(String str1, String str2) {

        if ((str1.isEmpty() || str2.isEmpty())){
            return "";
        }

        //GDC = Euclidian Algorithm
        int length1 = str1.length();
        int length2 = str2.length();
        while (length2 != 0) {
            int temp = length2;
            length2 = length1 % length2;
            length1 = temp;
        }

    
        var candidate = str1.substring(0, length1);

        var candidateLength = candidate.length();
        var candidateStr1 = true;
        var candidateStr2 = true;
        
        for (int i = 0; i < str1.length(); i += candidateLength ) {
            if (!str1.substring(i, i + candidateLength).equals(candidate)) {
                candidateStr1 = false;
                break;
            }
        }

        for (int i = 0; i < str2.length(); i += candidateLength ) {
            if (!str2.substring(i, i + candidateLength).equals(candidate)) {
                candidateStr2 = false;
                break;
            }
        }

        if (candidateStr1 && candidateStr2) {
            return candidate;
        } 
        
        return "";
    }
}

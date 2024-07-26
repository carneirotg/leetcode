public class ReverseStringOrder {
    public static void main(String[] args) {
        // System.out.println(reverseWords("the sky is blue") + " -> blue is sky the");
        // System.out.println(reverseWords(" hello world ") + " -> world hello");
        System.out.println(reverseWords("a good   example") + " -> example good a");
    }

    public static String reverseWords(String s) {

        String[] tokens = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = tokens.length - 1; i >= 0; i--) {
            if (tokens[i] != "") {
                sb.append(tokens[i].trim());
                sb.append(" ");
            }
        }
     
        return sb.toString().trim();
    }
}

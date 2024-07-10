public class MergeString {
    public static void main(String[] args) {

        System.out.println(mergeString("ab", "pqrs"));
        
    }

    public static String mergeString(String word1, String word2) {

        char[] wordArray = new char[word1.length()+word2.length()];

        int index = 0;
        for (int i = 0; i < word1.length(); i++) {
            wordArray[index] = word1.charAt(i);
            index++;
            if (i < word2.length()) {
                wordArray[index] = word2.charAt(i);    
                index++;
            }
            
        }

        if ( word2.length() > word1.length()) {
            for (int i = word1.length(); i < word2.length(); i++) {
                wordArray[index] = word2.charAt(i);
                index++;
            }
        }
        

        return String.valueOf(wordArray);
    }
}

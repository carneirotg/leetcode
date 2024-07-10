class Palindrome {
    public static void main(String[] args) {
        
       System.out.println(palindrome(-121));
    }

    public static boolean palindrome(int x) {

        var palindrome = String.valueOf(x);

        if (palindrome.charAt(0) != palindrome.charAt(palindrome.length()-1)) {
            return false;
        }



        System.out.println("input -> " + palindrome);
        var array = palindrome.toCharArray();
        var tmpPalindrome = "";
        for (int i = array.length-1; i >= 0; i--) {
            tmpPalindrome += (array[i]);e
        }
        System.out.println("output -> " + tmpPalindrome);

        return tmpPalindrome.equals(palindrome);
    }
}
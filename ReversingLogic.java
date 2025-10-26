
public class ReversingLogic {

    public static String reverseString(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;

    }

    public static boolean isPalindromeString(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        String reversed = "";

        System.out.println(words.length);

        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
        }

        return reversed.trim();
    }

    public static String reverseEachWord(String str) {

        String[] words = str.split(" ");
        String reversedSentence = "";

        for (String word : words) {
            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }
            reversedSentence += reversedWord + " ";
        }

        return reversedSentence.trim();
    }

    public static char middleChar(String str) {
        int start = 0;
        int end = str.length() - 1;

        int mid = (start + end) / 2;

        char midChar = str.charAt(mid);

        return midChar;

    }

    public static boolean isPalindromeNumber(int n) {

        int original = n;

        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }

    public static int reverseNumber(int n) {

        int original = n;

        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println("===========Main methods============");

        // Q1
        String s1 = "alam";
        System.out.println(reverseString(s1));

        // Q2
        String s2 = "abbba";
        System.out.println(isPalindromeString(s2));

        // Q4
        String s3 = "Java is a programing language";
        System.out.println(reverseWords(s3));

        System.out.println(reverseEachWord(s3));

        System.out.println(middleChar(s1));



        int n = 1231;

        System.out.println(reverseNumber(n));


        System.out.println(isPalindromeNumber(n));

    }

}

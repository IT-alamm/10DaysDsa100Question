
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

// package 10DaysDsa100Question.Day7;

public class StringManipulation {

    public static int getCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }
        return count;
    }

    public static HashMap<Character, Integer> findFrequency(String str) {

        HashMap<Character, Integer> freq = new HashMap<>();

        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        return freq;
    }

    public static String removeDuplicate(String str) {

        StringBuilder sb = new StringBuilder();
        HashSet<Character> hs = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!hs.contains(ch)) {
                hs.add(ch);
                sb.append(ch);
            }
        }

        return sb.toString();

    }

    public static boolean isAnnagrams(String str, String str1) {

        if (str.length() != str1.length()) {
            return false;
        }

        char[] arr = str.toCharArray();
        char[] arr1 = str1.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);

        return Arrays.equals(arr, arr1);

    }


    public static String replaceWith(String str, char ch){

        return  str.replace(' ', ch);
    }



    public static Character getNonRepeatingChar(String str) {
       HashMap<Character, Integer> hs1 = new HashMap<>();

       for(char ch : str.toCharArray()){
        hs1.put(ch, hs1.getOrDefault(ch, 0)+1);
       }

       for(Map.Entry<Character,Integer> entry : hs1.entrySet()){
        if(entry.getValue() == 1){
            return entry.getKey();
        } 
       }
       return null;



    }

    public static boolean isAlphabetOnly(String str){
        for(char ch : str.toCharArray()){
            if(!Character.isLetter(ch)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "silent";
        String str1 = "listen";
        String str2 = "swiss";
        String str3 = "hello world java";
        char ch = '-';
        System.out.println(getCount(str));

        // System.out.println(findFrequency(str));

        // System.out.println(removeDuplicate(str));

        System.out.println(isAnnagrams(str, str1));

        System.out.println(getNonRepeatingChar(str2));

        System.out.println(replaceWith(str3, ch));
    }
}

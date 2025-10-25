
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BasicStrinAndCounting {


    public static int countVowelsAndConstantsAndDigitsAndSpaceAndUpper(String str){
        int count = 0;
        int constants = 0; 
        int digits = 0;
        int space = 0;
        int upper = 0;




       
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if("aeiou".indexOf(ch) != -1) count++;
            else if(ch >='a' && ch <='z') constants++;
            else if(ch >='0' && ch <='9') digits++;
            else if (ch == 32) space++;
            else if(ch >='A' && ch <='Z') upper++;
            

        }
        return upper;
    }

    public static void checkVowelsOrConsonants(String str){
        str = str.toLowerCase();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if("aeiou".indexOf(ch) != -1){
                System.out.println(ch  +" is a vowels.");
            }else{
                System.out.println(ch + " is a consonants.");
            }
        }
    }

    public static int len(String str){

        int lLength = 0;

        for(int i = 0; i<str.length(); i++){
            lLength++;
        }

        return lLength;


    }
     
    public static void removeSpace(String str){
        // String result = str.replace(" ", "");
        String result = "";
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch != ' ') {
                result += ch;

            }
        }
        System.out.println(" Old string is : "+str + ", new string is : " + result);
    }


    public static boolean isContainString(String str){
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(!Character.isDigit(ch)){
                return true;
            }
        }
        return  false;
    }

    public static void sort(int arr[]){
        List<Integer> l1 = new ArrayList<>();
        for(int a : arr){
            l1.add(a);
        }
        Collections.sort(l1);
        System.out.println(l1);
    }


    public static void main(String[] args) {
        System.out.println("===========Main methods Starts==========");
        // Q1 to Q6 
         String s1 = "JAav8au1236 ";
         System.out.println(countVowelsAndConstantsAndDigitsAndSpaceAndUpper(s1));

        //  Q7
         String s2 = "E";
         checkVowelsOrConsonants(s2);

        //  Q8 
        String s3 = "Mahtab Alam";
        System.out.println("Length of " +s3 + " is : " +len(s3));
        // Q9
        String s4 = "Hello World";
        removeSpace(s4);

        // Q10
        String s5 = "1233433";
        System.out.println(isContainString(s5));

        int arr[] = {5,3,2,11,21,44,9,23,1};
        sort(arr);


    }
}
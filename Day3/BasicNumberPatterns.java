public class BasicNumberPatterns {

    public static int sumOfNumber(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            n /= 10;
        }
        return sum;
    }

    public static int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void checkNumber(int n) {
        if (n > 0) {
            System.out.println(n + " is a positive number.");
        } else {
            System.out.println(n + " its a negative number.");
        }
    }

    public static int productOfNumber(int n) {
        int prod = 1;
        while (n > 0) {
            int digit = n % 10;
            prod *= digit;
            n /= 10;
        }
        return prod;
    }

    public static boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return original == reversed;
    }

    public static int sumOfEven(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            n /= 10;
        }
        return sum;
    }

    public static int sumOfOdd(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {

                n /= 10;
                continue;

            }
            sum += digit;
            n /= 10;

        }
        return sum;
    }

    public static void displayDigit(int n){
        while(n>0){
            int digit = n%10;
            System.out.println(digit);
            n /=10;

        }
    }

    public static void main(String[] args) {

        int n = 234;
        System.out.println(sumOfNumber(n));

        System.out.println(countDigit(n));

        checkNumber(n);

        System.out.println(productOfNumber(n));

        System.out.println(isPalindrome(n));

        System.out.println(sumOfEven(n));

        System.out.println(sumOfOdd(n));

        displayDigit(n);

    }
}
import java.util.Arrays;

public class ArrayFundamental {

    public static int countEven(int arr[]){
        int count = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
    }

    public static int[] maxAndMinElement(int arr[]){
        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;

        int max = arr[0];
        int min = arr[0];

        int result[] = new int[2];

        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }else if(arr[i]<min){
                min = arr[i];
            }
        }
        result[0] = min;
        result[1] = max;

        return result;
    }

    public static int sumOfElements(int arr[]){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum +=arr[i];
        }
        return sum;
    }

    public static int avgOfElements(int arr[]){
        int sum = 0;
        int avg = 0;
        int n = arr.length;
        for(int i = 0; i<arr.length; i++){
            sum +=arr[i];
        }
        avg =sum/n;
        return avg;
    }

    public static int firstOccurance(int arr[],int value){
        for(int i = 0; i<arr.length; i++)
            if(arr[i]==value){
                 return i;
            }
            return  -1;
 
    }
    
    public static void main(String[] args) {
        System.out.println("=================Main methods================");
       
        int arr[] = {334,2,6,53,2,76,43,87,99,25};
        int value = 53;

        // Q1
        System.out.println(countEven(arr));

        System.out.println(Arrays.toString(maxAndMinElement(arr)));

        System.out.println(sumOfElements(arr));

        System.out.println(avgOfElements(arr));

        System.out.println(firstOccurance(arr, value));
        
         int index = firstOccurance(arr, value);
        if(index == -1){
          System.out.println("occurance is not found ");
        }else{
            System.out.println("first occrance of " + value + " is at of " + index);
        }

    }
}

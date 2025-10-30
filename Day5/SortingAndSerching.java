
import java.util.Arrays;

// package 10DaysDsa100Question.Day5;

public class SortingAndSerching {

    public static int[] sortArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n - i; j++) { // compare adjacent elements
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] sortArrayDesc(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n - i; j++) { // compare adjacent elements
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int isLinearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int  binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;

    }

    public static  void kthSmallest(int arr[], int k){
        Arrays.sort(arr);
        System.out.println("kth element is : " +arr[k-1]);
    }

    public static boolean isSort(int arr[]){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > arr[i+1])
            return false;

        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("============Main methods================");

        int arr[] = { 14, 2, 76, 34, 23, 8, 21, 9 };
        int arr1[] = { 15, 2, 76, 34, 23, 8, 21, 9 };

        int arr2[] = {4,7,9,11,21,26,37,43,56,97};

        int arr3[] = {4,2,5,62,8,9};

        int result[] = sortArray(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        int result1[] = sortArrayDesc(arr1);

        System.out.println();

        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");
        }

        System.out.println();
        System.out.println(isLinearSearch(arr, 2));



        System.out.println(binarySearch(arr2,21));

        kthSmallest(arr2, 3);

        System.out.println(isSort(arr3));

    }
}

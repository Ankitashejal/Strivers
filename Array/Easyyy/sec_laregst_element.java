package Array.Easyyy;
import java.util.Arrays;

//1.Brute force(only applies if there are no duplicates)
//first sort and the print second-smallest and sec-last element

public class sec_laregst_element {
    public static void main(String[] args) {
        int arr[] =  {2, 5, 1, 3, 0};
        // Print second smallest element
        System.out.println("The second Smallest element in the array is: " + findSecondSmallest(arr));
        // Print second largest element
        System.out.println("The second Largest element in the array is: " + findSecondLargest(arr));
    }

    static int findSecondSmallest(int[] arr) {
        Arrays.sort(arr);
        return arr[1];  
    }

    static int findSecondLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];  
    }
}

//2.Optimal approach

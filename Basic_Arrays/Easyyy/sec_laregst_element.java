package Basic_Arrays.Easyyy;
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
// in this approach to find the second smallest and second largest elements in an array without sorting the entire array is to iterate through the array once.
//time complexity of O(n)


// public class SecondSmallestLargestElement {
//     public static void main(String[] args) {
//         int arr[] = {2, 5, 1, 3, 0};
//         int[] results = findSecondSmallestAndLargest(arr);
        
//         System.out.println("The second Smallest element in the array is: " + results[0]);
//         System.out.println("The second Largest element in the array is: " + results[1]);
//     }

//     static int[] findSecondSmallestAndLargest(int[] arr) {
//         int smallest = Integer.MAX_VALUE;
//         int secondSmallest = Integer.MAX_VALUE;
//         int largest = Integer.MIN_VALUE;
//         int secondLargest = Integer.MIN_VALUE;
        
//         for (int num : arr) {
//             if (num < smallest) {
//                 secondSmallest = smallest;
//                 smallest = num;
//             } else if (num < secondSmallest && num != smallest) {
//                 secondSmallest = num;
//             }

//             if (num > largest) {
//                 secondLargest = largest;
//                 largest = num;
//             } else if (num > secondLargest && num != largest) {
//                 secondLargest = num;
//             }
//         }
        
//         int[] results = new int[2];
//         results[0] = secondSmallest;
//         results[1] = secondLargest;
//         return results;
//     }
// }


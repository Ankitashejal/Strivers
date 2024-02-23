package Array.Easyyy;
import java.util.Arrays;

//1.Brute force approach
//sort the array and the print(arr-1).
//Time-C = O(nlogn)
public class largest_element {
    public static void main(String[] args) {
            int arr[] =  {2,5,1,3,0};
            System.out.println("The Largest element in the array is: " + sort(arr));
           
          }
          static int sort(int arr[]) {
            Arrays.sort(arr);
            return arr[arr.length-1];
    }
}


//2.Optimal approach
//Time-C = O(n)
// public class Largestelement {
//     public static void main(String[] args) {
//                 int[] A = {10, 5, 7, 8, 20};
//                 System.out.println("The largest element in the array is: "  + arr); 
//             }
        
//             public int largest(int arr[], int n)
//             {
//                 int a=Integer.MIN_VALUE;
//               for(int i=0;i<n;i++){
//                   if(arr[i]>a) //If an element is greater than the current value of a, a is updated to that element.
//                   a=arr[i]; 
//               }
//               return a;
//             }
// }

package Basic_Arrays.Easyyy;

// We can take another dummy array of the same length and then shift all elements in the array toward the left and then at the last element store the index of 0th index of the array and print it.
//Time Complexity: O(n)
public class left_rotate_the_array {

    static void solve(int arr[], int n) {
        int temp[]=new int[n];
        for (int i = 1; i < n; i++) {
          temp[i - 1] = arr[i];
        }
        temp[n - 1] = arr[0];
        for (int i = 0; i < n; i++) {
          System.out.print(temp[i]+" ");
        }
    }
    public static void main(String[] args) {
        int n=5;
        int arr[]= {1,2,3,4,5};
        solve(arr, n);
    }
}

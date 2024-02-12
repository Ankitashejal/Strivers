package DSA.Linearsearch;

public class searchin2darray {
    public static void main(String[] args) {
        int[][] arr = {
            {12, 5, 3},
            {89, 23, 67},
            {10, 45, 72}
        };
        int target = 23;
        System.out.println(search(arr, target));
    }

    static int search(int arr[][], int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return target;
                }
            }
        }
        return -1; // Return -1 if target not found
    }
}



package DSA;
import java.util.*;
import java.util.Random;
public class lab1{
    public static void shuffelArray(int[] arr){
        int size= arr.length;
        Random r = new Random();
        for (int i=size-1 ;i>0; i--){
            
        }

    }
    public static void divide(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conqure(arr, si, ei);
    }

    public static void conqure(int[] arr, int si, int ei) {
        int[] mergredarr = new int[ei - si + 1];
        int index1 = si;
        int mid = si + (ei - si) / 2;
        int index2 = mid + 1;
        int x = 0;
        while (index1 <= mid && index2 <= ei) {
            if (arr[index1] <= arr[index2]) {
                mergredarr[x] = arr[index1];
                x++;
                index1++;
            } else {
                mergredarr[x] = arr[index2];
                x++;
                index2++;
            }
        }

        while (index1 <= mid) {
            mergredarr[x] = arr[index1];
            x++;
            index1++;
        }

        while (index2 <= ei) {
            mergredarr[x] = arr[index2];
            x++;
            index2++;
        }

        for (int i = 0, j = si; i < mergredarr.length; i++, j++) {
            arr[j] = mergredarr[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[10];
        int r = 52;
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = r + (r + 1) * i;
        }
        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i] + " ");
        }


        int size=arr.length;

        divide(arr, 0, size-1);

        for(int i=0; i<arr.length;i++){
        System.err.print(arr[i]+" ");
        }
        System.out.println();
    }
}
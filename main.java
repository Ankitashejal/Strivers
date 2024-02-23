
import java.util.Arrays;
public class main {

    static void printarr(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        Arrays.sort(arr);
        printarr(arr);

    }
}


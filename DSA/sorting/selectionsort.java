package DSA.sorting;

public class selectionsort {

    static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
           int min=i;
           for(int j=i+1;j<=arr.length-1;j++){
            if(arr[min]>arr[j]){//if min<j the order would be descending
                min =j;
            }
           }
           //swaping to min with i
           int temp =arr[i];
           arr[i]=arr[min];
           arr[min]=temp;
    }
}

    public static void print(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={1,5,4,2,3};
        sort(arr);
       print(arr);

    }

}

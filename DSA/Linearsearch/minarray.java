package DSA.Linearsearch;

public class minarray {
    public static void main(String[] args) {
        int arr[] ={1,-8,7,18,2,70};
        System.out.println(min(arr));

    }

    static int min(int arr[]){
        int ans = arr[0];   
        for( int i=1; i<arr.length; i++){
           if(arr[i]<ans){
            ans = arr[i];
           }
        }
       return ans;
    }
   
}


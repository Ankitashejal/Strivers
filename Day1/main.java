
    public class main {
        public static void main(String[] args) {
            int[] A = {10, 5, 7, 8, 20};
            System.out.println("The largest element in the array is: "  + arr); 
        }
    
        public int largest(int arr[], int n)
        {
            int a=Integer.MIN_VALUE;
          for(int i=0;i<n;i++){
              if(arr[i]>a)a=arr[i];
          }
          return a;
        }
        }
    
    

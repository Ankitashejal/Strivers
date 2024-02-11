package DSA.Linearsearch;
public class main {
    public static void main(String[] args) {
        int nums[]={12,5,4,3,2,1,8,0};
        int target = 19;
        int ans = Search(nums,target);
        System.out.println(ans);
    }

    //first we will search in the array :return index if found
    //or if the item is not found
    static int Search(int[] arr,int target) {
        if (arr.length==0){ //This line checks if the length of the array arr is equal to 0, indicating that the array is empty.
            return  -1;
        }
//run for a loop
        for(int index=0 ; index<arr.length ; index++){
            //check for elemnt of every index if ==target
            int element = arr[index];
            if(arr[index]==target){
                return index;
            }
        }
        //this will execute i fnone of the above elem does note exists in the
       return -1;
     }
}


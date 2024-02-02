package DSA.arraysdp;

public class dp2 {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        int target =0;

        System.out.println("index of target"+);
    }

    static int search(int nums[],int target){
     int left =0;
     int right = nums.length-1;

     while(left<right){
        int mid = left+(right-left)/2;
        if (nums[mid]==target){
            return mid;
        }
//check which half side is sorted
       if(nums[left]<=nums[mid]){

        if (nums[left] <= target && target < nums[mid]){//left half is sorted
right = mid-1;
        }
        else{
            left = mid+1;
        }
       }
     }
    }
}

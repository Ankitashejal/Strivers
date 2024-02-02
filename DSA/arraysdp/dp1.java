package DSA.arraysdp;

public class dp1 {
    
        static boolean containsduplicate(int nums[]) {
            for (int i = 0; i < nums.length; i++) {//this iterates from 0 to end of the array
                for (int j = i + 1; j < nums.length; j++) {//j+1 is done to avoid the comparison of element with itself
                    if (nums[j] == nums[i]) {
                        return true;
                    }
                }
            }
            return false;
        }
    
        public static void main(String[] args) {
            int nums[] = {1, 2, 3, 4, 5, 6};
    
            boolean result = containsduplicate(nums);//the fun is called and stored in result

            System.out.println("Contains Duplicate: " + result);
        }
    }
    


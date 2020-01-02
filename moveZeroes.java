//move zeroes to the right

class Solution {
    public void moveZeroes(int[] nums) {
       int leftBar = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[leftBar++] = nums[i];
            }
        }
        //everything after leftBar is zeroes
        for(int i = leftBar; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            //if in range, then search there. 
            //otherwise try the other half
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] <= nums[right]){
                //right half is sorted
                if(target>= nums[mid] && target <= nums[right]){
                    //target is in right half
                    left = mid + 1;
                }else{
                    //target is not in right half.
                    right = mid - 1;
                }
            }else if(nums[left] <= nums[mid]){
                //left half is sorted
                if(target >= nums[left] && target <= nums[mid]){
                    //target is in left half
                    right = mid - 1;
                }else{
                    //target is not in left half. 
                    left = mid + 1;
                }
            }
            
        }
        return -1;
    }
}

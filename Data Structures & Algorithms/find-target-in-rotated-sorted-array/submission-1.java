class Solution {
    public int search(int[] nums, int target) {
        int l =0;
        int r = nums.length -1;

        while(l<=r){
            int mid = l + (r-l)/2;

            if(target == nums[mid]){
                return mid;
            }
        //check the sorted portion
            if(nums[l] <= nums[mid] ){ //  left is sorted

            // no as BS you should figure out the portion to be eliminated
                if(target >=nums[l] && target <= nums[mid] ){
                   r = mid -1; 
                }else{
                    l = mid +1;
                }

            }else{ // right side is sorted
                if(target <= nums[r] && target >= nums[mid]){
                        l = mid +1;
                }else{
                    r = mid -1;
                }


            }
        }
        return -1;
    }
}

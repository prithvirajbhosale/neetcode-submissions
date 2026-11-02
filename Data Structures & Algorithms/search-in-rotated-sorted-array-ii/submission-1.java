class Solution {
    public boolean search(int[] nums, int target) {
        int l =0;
        int r = nums.length -1;

        while(l<=r){
            int mid = l + (r-l)/2;

            if(target == nums[mid]){
                return true;
            }

            // the only issue with when low is == to mid == high, so just shrink the search

            if(nums[l] == nums[mid] && nums[mid] == nums[r]){
                l = l +1;
                r = r-1;
                continue;
            }
        
            if(nums[l] <= nums[mid] ){ 

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
        return false;
    }
    }

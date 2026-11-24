class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i =0; i< nums.length; i++ ){
            if(map.containsKey(nums[i]) && i - map.get(nums[i]) <=k){
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
        
    }
}

/*
1 2 3 1 k =3
i      j
 if(nums[i] == nums[j]){
 abs(i-j)<=k true
 }

 2 1 2 k =1
 i.  j




**/
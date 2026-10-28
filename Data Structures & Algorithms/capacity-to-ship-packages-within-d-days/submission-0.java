class Solution {
    public int shipWithinDays(int[] weights, int days) {
       int l = Arrays.stream(weights).max().getAsInt();
       int r = Arrays.stream(weights).sum();

       while(l<r) {
        int mid = l + (r-l)/2;
        if(calculateDays(weights,mid) <= days){
            r = mid;
        
        }
        else{
            l = mid+1;
        }
       }
       return l;
    }

   
    private int calculateDays(int[] weights, int capacity){
        int days = 1;
        int load = 0;

        for(int weight : weights){
            if(weight + load > capacity){
                days ++;
                load = 0;
            }
                load += weight;
            
        }
        return days;
    }
}



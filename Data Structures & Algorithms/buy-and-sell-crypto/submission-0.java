class Solution {
    public int maxProfit(int[] prices) {

        int l =0, r =1, profit =0, mp =0;

    for(int i =0; i< prices.length -1; i++){
        if(prices[r] > prices[l]){

            profit = prices[r] - prices[l];
            mp = Math.max(profit, mp);

        }
        else{
            l = r;
    }
        r ++;
    }

    return mp;

    }
}


/*
10 1 5 6 7 1 
l =0, r=1,MP = 0, P=0

10 1 5 6 7 1 
   l       r
p = 4, mp=4

p = 5 , mp = 5
p = 6, mp= 6
p =0

for(i = , < prices.len){
if(prices[r] > prices[l])
profit = prices[r] - prices[l]
mp = Math.max(profit, mp);
}else{
l = right;
}
right = right +1;


*/
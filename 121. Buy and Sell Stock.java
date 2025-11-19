//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

class Solution {
    public int maxProfit(int[] prices) {
      int l=0;
      int r=1;
      int profit=0;
      int maxi=0;
      while(r<prices.length){
        if(prices[l]<prices[r]){
            profit=prices[r]-prices[l];
            maxi=Math.max(profit,maxi);
        }
        else{
            l=r;
        }
        r++;
      } 
              return maxi;
 
    }
}

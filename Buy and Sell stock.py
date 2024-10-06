#https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        l,r=0,1
        n=len(prices)
        mp=0
        while r<n:
            if prices[l]<prices[r]:
                prf=prices[r]-prices[l]
                mp=max(mp,prf)
            else:
                l=r
            r+=1
        return mp

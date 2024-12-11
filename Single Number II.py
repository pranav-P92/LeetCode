#https://leetcode.com/problems/single-number-ii/


class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        count={}
        for i in nums:
            if i not in count:
                count[i]=1
            else:
                count[i]+=1
        for j,k in count.items():
            if k==1:
                return j

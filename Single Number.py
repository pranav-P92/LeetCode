#https://leetcode.com/problems/single-number/



class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        res=0
        for i in nums:
            res^= i
        return res
        
        # s=[]
        # for i in range(len(nums)):
        #     if nums[i] not in s:
        #         s.append(nums[i])
        #     else:
        #         s.remove(nums[i])
        # return s[0]
        

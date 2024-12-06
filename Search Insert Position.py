#https://leetcode.com/problems/search-insert-position/

class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        for i in range(len(nums)):
            if((target==nums[i]) or (target<nums[i])):
                return i
        else:
            return (len(nums))
        

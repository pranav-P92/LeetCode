#https://leetcode.com/problems/factorial-trailing-zeroes/

class Solution:
    def trailingZeroes(self, n: int) -> int:
      count = 0
        while n > 0:
            n //= 5  # Count factors of 5
            count += n
        return count
      
        #or
        # res=1
        # count=0
        # for i in range(1,n):
        #     res*=i+1
        #     while n>0:
        #         if(res%10==0):
        #             count+=1
        #             res//=10
        #         else:
        #             break
        # return count
        

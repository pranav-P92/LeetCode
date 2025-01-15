#https://leetcode.com/problems/valid-perfect-square/


class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        sq=int(num**0.5)
        if sq*sq==num:
            return True
        else:
            return False 

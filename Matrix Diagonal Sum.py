#https://leetcode.com/problems/matrix-diagonal-sum/description/


class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
        psum=0
        ssum=0
        for i in range(len(mat)):
            psum+=mat[i][i]
            ssum+=mat[i][len(mat)-i-1]
        if len(mat)%2==0:
            return psum+ssum
        else:   
            return psum+ssum-mat[len(mat)//2][len(mat)//2]

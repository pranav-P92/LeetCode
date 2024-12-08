#https://leetcode.com/problems/path-sum/


# Definition for a Binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
        sum=0
        def has_sum(root, curSum):
            if not root:
                return False
            curSum+=root.val

            if not root.left and not root.right:
                return curSum==targetSum
            
            return has_sum(root.left,curSum) or has_sum(root.right,curSum)
        return has_sum(root,sum)

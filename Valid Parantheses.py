#https://leetcode.com/problems/valid-parentheses/


class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        for i in s:
            if i in {"(","[","{"}:
                stack.append(i)
            else:
                if not stack:
                    return False
                p=stack.pop()
                if((i==")" and p!="(") or (i=="}" and p!="{") or (i=="]" and p!="[") ):
                    return False
        return len(stack)==0
      

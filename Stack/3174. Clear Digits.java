//https://leetcode.com/problems/clear-digits/description/



//stack
//Time complexity: O(n)
//Space complexity: O(n)


class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack=new Stack<>();

        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                if(!stack.isEmpty() && Character.isLetter(stack.peek())){
                    stack.pop();
                }
                
            }
            else{
                stack.push(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:stack){
            sb.append(ch);
        }
        String result=sb.toString();
        return result;
    }
}

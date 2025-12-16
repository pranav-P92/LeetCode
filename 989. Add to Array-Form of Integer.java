//https://leetcode.com/problems/add-to-array-form-of-integer/description/

//math problem
//time complexity :O(n)
//space complexity :O(n)


class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
                i--;
            }
            result.add(k % 10);
            k /= 10;
        }

        Collections.reverse(result);
        return result;
    }
}

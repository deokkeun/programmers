class Solution {
    public int solution(int[] num_list) {
        int odd = 0;
        int even = 0;
        for(int i : num_list) {
            if(i % 2 == 1) {
                odd *= 10;
                odd += i;
            } else {
                even *= 10;
                even += i;
            }
        }
        return odd + even;
    }
}
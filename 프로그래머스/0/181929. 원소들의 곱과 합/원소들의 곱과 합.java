class Solution {
    public int solution(int[] num_list) {
        int multi = 1;
        int sum_pow = 0;
        for(int i : num_list) {
            multi *= i;
            sum_pow += i;
        }
        sum_pow = (int)Math.pow(sum_pow, 2);
        
        return multi > sum_pow ? 0 : 1;
    }
}
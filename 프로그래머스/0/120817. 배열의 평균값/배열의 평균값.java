class Solution {
    public double solution(int[] numbers) {
        int sum = 0;
        int l = numbers.length;
        if(1 <= l && l <= 100) {
            for(int n : numbers) {
                if(0 <= n && n <= 1000) {
                    sum += n;
                }
            }
            return (double)sum / l;
        }
        return -1;
    }
}
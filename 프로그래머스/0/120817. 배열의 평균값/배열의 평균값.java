class Solution {
    public double solution(int[] numbers) {
        double sum = 0, l = numbers.length;
        
        if(1 <= l && l <= 100) {
            for(int n : numbers) {
                if(0 <= n && n <= 1000) {
                    sum += n;
                }
            }
            return sum / l;
        }
        return -1;
    }
}
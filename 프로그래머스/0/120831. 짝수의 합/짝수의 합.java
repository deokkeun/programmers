class Solution {
    public int solution(int n) {
        if(0 < n && n <= 1000) {
            int a = (n % 2 == 0) ? n : n - 1; 
            return a / 2 * (2 + a) / 2;
        }
        return -1;
    }
}
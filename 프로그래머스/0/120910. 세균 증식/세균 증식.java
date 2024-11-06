class Solution {
    public int solution(int n, int t) {
        if(1 <= n && n <= 10 && 1 <= t && t <= 15) {
            return n << t;
        }
        return -1;
    }
}
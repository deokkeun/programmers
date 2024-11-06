class Solution {
    public int solution(int n, int k) {
        if(0 < n && n < 1000 && n / 10 <= k && k < 1000) {
            return (n * 12000) + (k - (n / 10)) * 2000;
        }
        return -1;
    }
}
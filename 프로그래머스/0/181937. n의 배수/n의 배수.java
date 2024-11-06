class Solution {
    public int solution(int num, int n) {
        if(2 <= num && num <= 100 && 2 <= n && n <= 9) {
            return (num % n == 0) ? 1 : 0;
        }
        return -1;
    }
}
class Solution {
    public int solution(String message) {
        int n = message.length();
        if(1 <= n && n <= 50) {
            return n * 2;
        }
        return -1;
    }
}
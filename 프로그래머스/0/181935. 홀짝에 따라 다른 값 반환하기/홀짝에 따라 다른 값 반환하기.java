class Solution {
    public int solution(int n) {
        int answer = 0;
        if(1 <= n && n <= 100) {
            for(int i = n; i >= 0; i -= 2) {
                answer += (n % 2 == 1)? i : i * i;
            }
        }
        return answer;
    }
}
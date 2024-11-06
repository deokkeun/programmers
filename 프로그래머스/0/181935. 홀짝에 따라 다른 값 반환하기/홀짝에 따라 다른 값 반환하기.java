class Solution {
    public int solution(int n) {
        if(1 <= n && n <= 100) {
            if(n % 2 == 0) {
                int sum = 0;
                for(int i = 0; i <= n; i++) {
                    if(i % 2 == 0) {
                        sum += i * i;
                    }
                }
                return sum;
            } else {
                return (n / 2 + 1) * (1 + n) / 2;
            }
        }
        return 0;
    }
}
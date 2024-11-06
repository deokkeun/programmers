import java.util.stream.IntStream;
class Solution {
    public int solution(int n) {
        if(0 < n && n <= 1000) {
            return IntStream.rangeClosed(0, n)
                    .filter(v -> v % 2 == 0)
                    .sum();
        }
        return -1;
    }
}
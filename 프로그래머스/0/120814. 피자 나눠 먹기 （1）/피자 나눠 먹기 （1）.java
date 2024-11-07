class Solution {
    public int solution(int n) {
        int a = n / 7;
        return (a * 7 < n) ? a + 1 : a;
    }
}
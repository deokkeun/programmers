class Solution {
    public int solution(int num1, int num2) {
        if(0 <= num1 && num1 <= 10000 && 0 <= num2 && num2 <= 10000) {
            return num1 == num2 ? 1 : -1;
        }
        return -1;
    }
}
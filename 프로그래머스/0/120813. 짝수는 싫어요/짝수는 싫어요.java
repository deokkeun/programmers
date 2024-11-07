class Solution {
    public int[] solution(int n) {
        int size = (n % 2 == 0) ? n / 2 : n / 2 + 1;
        int[] answer = new int[size];
        
        for(int i = 0; i < size; i++) {
            answer[i] = 1 + (i * 2);
        }
        return answer;
    }
}
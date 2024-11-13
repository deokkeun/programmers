class Solution {
    public int[] solution(int n, int k) {
        int index = n / k;
        int[] answer = new int[index];
        
        for(int i = 0; i < index; i++) {
            answer[i] = (i + 1) * k;
        }
        return answer;
    }
}
class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String str = String.valueOf(num);
        for(int i = 0; i < str.length(); i++) {
            if(str.substring(i, i + 1).equals(String.valueOf(k))) {
                return i + 1;
            }
        }
        return answer;
    }
}
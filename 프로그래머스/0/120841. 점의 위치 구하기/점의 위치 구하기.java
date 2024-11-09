class Solution {
    public int solution(int[] dot) {
        if(0 < dot[0]) {
            return (0 < dot[1]) ? 1 : 4;
        } else {
            return (0 < dot[1]) ? 2 : 3;
        }
    }
}
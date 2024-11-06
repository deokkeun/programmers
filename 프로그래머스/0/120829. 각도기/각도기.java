class Solution {
    public int solution(int angle) {
        if(0 < angle && angle <= 180) {
            return angle == 180 ? 4 : angle > 90 ? 3 : angle == 90 ? 2 : 1; 
        }
        return -1;
    }
}
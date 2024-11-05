class Solution {
    public int solution(int age) {
        if(0 < age && age <= 120) {
            return 2023 - age;
        }
        return -1;
    }
}
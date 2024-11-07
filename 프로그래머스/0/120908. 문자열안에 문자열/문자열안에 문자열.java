class Solution {
    public int solution(String str1, String str2) {
        if(1 <= str1.length() && str1.length() <= 100 && 1 <= str2.length() && str2.length() <= 100) {
            return str1.contains(str2) ? 1 : 2;   
        }
        return -1;
    }
}
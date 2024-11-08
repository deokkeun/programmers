class Solution {
    public String solution(String my_string, int n) {
        StringBuffer sb = new StringBuffer();
        for(char c : my_string.toCharArray()) {
            sb.append(String.valueOf(c).repeat(n));
        }
        return sb.toString();
    }
}
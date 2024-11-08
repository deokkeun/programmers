class Solution {
    public String solution(String my_string) {
        String str = "";
        for(char c : my_string.toCharArray()) {
            if(65 <= c && c <= 90) {
                str += Character.toLowerCase(c);
            } else {
                str += Character.toUpperCase(c);
            }
        }
        return str;
    }
}
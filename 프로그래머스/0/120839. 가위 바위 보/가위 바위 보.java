class Solution {
    public String solution(String rsp) {
        StringBuffer sb = new StringBuffer();
        for(char c : rsp.toCharArray()) {
            if(c == '0') {
                sb.append('5' - '0');
            } else if(c == '2') {
                sb.append('0' - '0');
            } else {
                sb.append('2' - '0');
            }
        }
        return sb.toString();
    }
}
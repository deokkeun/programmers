import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] strArr) {
        
        List<String> str = new ArrayList<>();
        
        for(int i = 0; i < strArr.length; i++) {
            if(!strArr[i].contains("ad")) {
                str.add(strArr[i]);
            }
        }
        return str.toArray(new String[0]);
    }
}
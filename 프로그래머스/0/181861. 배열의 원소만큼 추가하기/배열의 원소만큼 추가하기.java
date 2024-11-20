import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        for(int x = 0; x < arr.length; x++) {
            for(int y = 0; y < arr[x]; y++) {
                list.add(arr[x]);
            }
        }
        return list;
    }
}
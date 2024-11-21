import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();
        int[] before = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] last = Arrays.copyOfRange(num_list, 0, n);
        
        for(int i : before) {
            list.add(i);
        }
        for(int i : last) {
            list.add(i);
        }
        
        return list;
    }
}
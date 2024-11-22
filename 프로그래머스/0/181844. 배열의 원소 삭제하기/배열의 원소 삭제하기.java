import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> solution(int[] arr, int[] delete_list) {
        HashSet<Integer> deleteSet = new HashSet<>();
        for(int d : delete_list) {
            deleteSet.add(d);
        }
        List<Integer> list = new ArrayList<>();
        for(int l : arr) {
            if(!deleteSet.contains(l)) {
                list.add(l);
            }
        }
        return list;
    }
}
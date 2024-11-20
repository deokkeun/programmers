import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        
        int last = num_list[num_list.length - 1];
        int before = num_list[num_list.length - 2];
        
        answer[answer.length - 1] = last > before ? last - before : last * 2;
        
        return answer;
    }
}
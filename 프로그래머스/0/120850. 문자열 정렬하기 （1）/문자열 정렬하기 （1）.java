import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        String[] str = my_string.replaceAll("[a-z]", "").split("");
        int[] arr = new int[str.length];
        for(int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        return arr;
    }
}
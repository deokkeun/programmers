class Solution {
    public int[] solution(int[] arr, int n) {

        for(int i = arr.length - 1; i >= 0; i = i - 2) {
            if(i % 2 == 0) {
                arr[i] = arr[i] + n;
            } else {
                arr[i] = arr[i] + n;
            }
        }
        return arr;
    }
}
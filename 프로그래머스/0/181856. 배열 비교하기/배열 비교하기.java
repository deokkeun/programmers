class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if(arr1.length == arr2.length) {
            int sum1 = sum(arr1);
            int sum2 = sum(arr2);
            
            if(sum1 == sum2) {
                return 0;
            }
            return sum1 > sum2 ? 1 : -1;
        }
        return arr1.length > arr2.length ? 1 : -1;
    }
    
    public static int sum(int[] arr) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        return sum;
    }
}
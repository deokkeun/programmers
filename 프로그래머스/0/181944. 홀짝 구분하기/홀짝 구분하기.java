import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = n % 2 == 1 ? "odd" : "even";
        System.out.printf("%d is %s", n, result);
    }
}
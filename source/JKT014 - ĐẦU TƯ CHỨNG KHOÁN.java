import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] dp = new int[n + 1];
            int[] a = new int[n + 1];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < n; i++) {
                while (!st.empty() && a[st.peek()] <= a[i]) {
                    st.pop();
                }
                if (st.isEmpty()) {
                    dp[i] = i + 1;
                } else {
                    dp[i] = i - st.peek();
                }
                st.push(i);
            }
            for (int i = 0; i < n; i++) {
                System.out.print(dp[i] + " ");
            }
            System.out.println();
        }
    }
}
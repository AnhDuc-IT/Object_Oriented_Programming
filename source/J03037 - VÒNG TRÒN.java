import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] first = new int[26];
        int[] second = new int[26];
        Arrays.fill(first, -1);
        int count = 0;
        for (int i = 0; i < 52; i++) {
            int index = s.charAt(i) - 'A';
            if (first[index] == -1) {
                first[index] = i;
            } else {
                second[index] = i;
            }
        }
        for (int i = 0; i < 26; i++) {
            for (int j = i + 1; j < 26; j++) {
                if (first[j] < first[i] && first[i] < second[j] && second[j] < second[i]) {
                    ++count;
                }
                if (first[i] < first[j] && first[j] < second[i] && second[i] < second[j]) {
                    ++count;
                }
            }
        }
        System.out.println(count);
    }
}

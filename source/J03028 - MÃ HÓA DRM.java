import java.util.*;

public class Solution {
    public static String Change(String s) {
        int n = s.length();
        String s1 = s.substring(0, n / 2);
        String s2 = s.substring(n / 2, n);
        int total1 = 0;
        for (int i = 0; i < n / 2; i++) {
            total1 += s1.charAt(i) - 'A';
        }
        int total2 = 0;
        for (int i = 0; i < n / 2; i++) {
            total2 += s2.charAt(i) - 'A';
        }
        total1 %= 26;
        total2 %= 26;
        StringBuilder ss1 = new StringBuilder();
        StringBuilder ss2 = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            char c = (char) ((s1.charAt(i) - 'A' + total1) % 26 + 'A');
            ss1.append(c);
        }
        for (int i = 0; i < n / 2; i++) {
            char c = (char) ((s2.charAt(i) - 'A' + total2) % 26 + 'A');
            ss2.append(c);
        }
        ss1.toString();
        ss2.toString();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            int cc = ss2.charAt(i) - 'A';
            char c = (char) ((ss1.charAt(i) - 'A' + cc) % 26 + 'A');
            res.append(c);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(Change(s));
        }
    }
}
import java.util.*;

public class Solution {
    public static String Change(String s) {
        int n = s.length();
        String s1 = s.substring(0, n / 2);
        String s2 = s.substring(n / 2, n);
        int total1 = 0;
        for (int i = 0; i < n / 2; i++) {
            total1 += s1.charAt(i) - 'A';
        }
        int total2 = 0;
        for (int i = 0; i < n / 2; i++) {
            total2 += s2.charAt(i) - 'A';
        }
        total1 %= 26;
        total2 %= 26;
        StringBuilder ss1 = new StringBuilder();
        StringBuilder ss2 = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            char c = (char) ((s1.charAt(i) - 'A' + total1) % 26 + 'A');
            ss1.append(c);
        }
        for (int i = 0; i < n / 2; i++) {
            char c = (char) ((s2.charAt(i) - 'A' + total2) % 26 + 'A');
            ss2.append(c);
        }
        ss1.toString();
        ss2.toString();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            int cc = ss2.charAt(i) - 'A';
            char c = (char) ((ss1.charAt(i) - 'A' + cc) % 26 + 'A');
            res.append(c);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(Change(s));
        }
    }
}
package Buoi2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += a[i];
        }

        int j = 0;
        int last = 0;
        int ans = (int) -1e9;

        for (int i = k; i < n; i++) {
            sum += a[i];
            last += a[j++];
            ans = Math.max(ans, sum);
            if (last < 0) {
                sum -= last;
                ans = Math.max(ans, sum);
                last = 0;
            }
        }

        System.out.println(ans);

        sc.close();
    }
}

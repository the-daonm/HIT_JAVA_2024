package Buoi2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a[mid] <= k) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        if (a[hi] != k) {
            System.out.println(-1);
        } else {
            System.out.println(hi);
        }
        sc.close();
    }
}


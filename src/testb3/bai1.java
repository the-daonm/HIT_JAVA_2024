package testb3;

import java.util.Scanner;

public class bai1 {

    public static String change(int x) {
        if (x == 0) return "khong";
        if (x == 1) return "mot";
        if (x == 2) return "hai";
        if (x == 3) return "ba";
        if (x == 4) return "bon";
        if (x == 5) return "nam";
        if (x == 6) return "sau";
        if (x == 7) return "bay";
        if (x == 8) return "tam";
        if (x == 9) return "chin";
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[3];
        int i = 0;
        while (n > 0) {
            a[i++] = n % 10;
            n /= 10;
        }
        if (a[2] == 0) {
            if (a[1] == 0) {
                System.out.println(change(a[0]));
            } else if (a[1] == 1) {
                System.out.println(" muoi " + (a[0] != 0 ? change(a[0]) : ""));
            } else {
                System.out.println(change(a[1]) + " muoi " + (a[0] != 0 ? change(a[0]) : ""));
            }
        } else {
            if (a[1] == 0) {
                System.out.println(change(a[2]) + " tram " + (a[0] != 0 ? ("linh " + change(a[0])) : ""));
            } else if (a[1] == 1) {
                System.out.println(change(a[2]) + " tram muoi " + (a[0] != 0 ? change(a[0]) : ""));
            } else {
                System.out.println(change(a[2]) + " tram " + change(a[1]) + " muoi " + (a[0] != 0 ? change(a[0]) : ""));
            }
        }

        sc.close();
    }
}

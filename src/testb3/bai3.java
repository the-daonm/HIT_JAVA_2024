package testb3;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        int y = sc.nextInt();
        double ans = 1;
        for (int i = 0; i < y; i++) {
            ans *= x;
        }
        System.out.println(ans);

        sc.close();
    }
}

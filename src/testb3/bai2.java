package testb3;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        StringBuilder alp = new StringBuilder();
        StringBuilder num = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                alp.append(s.charAt(i));
            } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                num.append(s.charAt(i));
            }
        }
        System.out.println(alp);
        System.out.println(num);

        sc.close();
    }
}

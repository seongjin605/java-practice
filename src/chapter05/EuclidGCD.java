package chapter05;

import java.util.Scanner;

public class EuclidGCD {

    static int gcd(int x, int y) {
        if (y == 0)
            return x;
        else
            return gcd(y, x % y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 x를 입력하세요.");
        int x = sc.nextInt();

        System.out.println("정수 y를 입력하세요.");
        int y = sc.nextInt();

        System.out.println("최대 공약수는 " + gcd(x, y) + "입니다.");
    }
}

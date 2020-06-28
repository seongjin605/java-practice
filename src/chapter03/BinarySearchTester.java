package chapter03;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("요솟수: ");

        int num = sc.nextInt();
        int[] x = new int[num];

        System.out.print("x[0]: ");
        x[0] = sc.nextInt( );

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "]: ");
                x[i] = sc.nextInt( );
            } while (x[i] < x[i - 1]);
        }

        System.out.println("검색 할 값 : ");
        int key = sc.nextInt( );

        int index = Arrays.binarySearch(x, key);

        if (index == -1)
            System.out.println("찾으려는 값이 요소에 없음.");
        else
            System.out.println("key" + "는 " + "x[" + index + "]에 있습니다.");
    }
}

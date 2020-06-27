package chapter03;

public class BinarySearch {
    static int binarySearch(int[] a, int n, int key) {
        int left = 0;
        int right = n - 1;

        do {
            int center = (left + right) / 2;
            if (a[center] == key)
                return center;
            else if (a[center] < key)
                left = center + 1;
            else
                right = center - 1;
        } while (left <= right);
        return -1;
    }
}

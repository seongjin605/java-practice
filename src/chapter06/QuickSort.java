package chapter06;

public class QuickSort {
    private static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int left, int right) {
        int part2 = partition(arr, left, right); // 나눈 파티션 맨 오른쪽 배열 첫번째 값을 가져옴.
        if (left < part2 - 1) {
            quickSort(arr, left, part2 - 1);
        }
        if (part2 < right) {
            quickSort(arr, part2, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[(left + right) / 2];
        while (left <= right) {
            while (arr[left] < pivot) left++;
            while (arr[right] > pivot) right--;
            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private static void swap(int[] arr, int left, int right) {
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }

    private static void printArr(int[] arr) {
        for (int data : arr) {
            System.out.print(data + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 9, 4, 7, 5, 0, 1, 6, 8, 2};
        printArr(arr);
        quickSort(arr);
        printArr(arr);
    }
}

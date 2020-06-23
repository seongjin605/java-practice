package chapter02;

public class CardConRev {
    static int cardConR(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLNMOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;

        } while (x != 0);
        return digits;
    }
    public static void main(String[] args) {
        char[] a = new char[18];
        System.out.println(cardConR(59, 16, a));

    }
}

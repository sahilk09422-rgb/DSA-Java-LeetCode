class Solution {
    public int reverse(int x) {
        int revers = 0;

        while (x != 0) {
            int lastdigit = x % 10;
            x = x / 10;

            if (revers > Integer.MAX_VALUE / 10 || (revers == Integer.MAX_VALUE / 10 && lastdigit > 7)) {
                return 0;
            }

            if (revers < Integer.MIN_VALUE / 10 || (revers == Integer.MIN_VALUE / 10 && lastdigit < -8)) {
                return 0;
            }

            revers = revers * 10 + lastdigit;
        }

        return revers;
    }
}

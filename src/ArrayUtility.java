public class ArrayUtility {

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i == array.length - 1) {
                continue;
            }
            System.out.print(", ");
        }
        System.out.println();
    }

    public static int sum(int[] array) {
        int j = 0;
        for (int k: array) {
            j += k;
        }
        return j;
    }

    public static double average(int[] array) {
        double d = sum(array);
        d /= array.length;
        return Math.round(d * 100.0) / 100.0;
    }

    public static int minimum(int[] array) {
        int m = Integer.MAX_VALUE;
        for (int i : array) {
            if ( i < m ) {
                m = i;
            }
        }
        return m;
    }

    public static int maximum(int[] array) {
        int m = Integer.MIN_VALUE;
        for (int i : array) {
            if ( i > m ) {
                m = i;
            }
        }
        return m;
    }

    public static int evenCount(int[] array) {
        int j = 0;
        for ( int i: array ) {
            j += (i % 2 == 0) ? 1 : 0;
        }
        return j;
    }

    public static int[] reverseOne(int[] array) {
        int[] j = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            j[i] = array[array.length - (i + 1)];
        }
        return j;
    }

    public static void reverseTwo(int[] array) {
        // 0 switch with 4
        // 1 switch with 3
        // 2 switch with 2
        // ...
        for (int i = 0; i < array.length / 2; i++) {
            int first = array[i];
            int last = array[array.length - (i + 1)];
            array[i] = last;
            array[array.length - (i + 1)] = first;

        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int j : array) {
            if (j == num) return true;
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (String j : array) {
            if (j.equals(str)) return true;
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= n;
        }
    }

    public static String toString(int[] array) {
        StringBuilder k = new StringBuilder();
        for ( int i = 0; i < array.length; i ++ ) {
            k.append(array[i]);
            if (i == array.length - 1) {
                continue;
            }
            k.append(", ");
        }
        return k.toString();
    }

    // leet code??????????????????????????????!!!!!!!!!!!!!!!!
    public static boolean twoSum(int[] array, int num) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) continue;
                if (array[i] + array[j] == num) return true;
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int k = array.length;
        int l = array[k-1];
        for (int i = k-1; i > 0; i--) {
            array[i] = array[i-1];
        }
        array[0] = l;
    }

    public static void shiftLeft(int[] array) {
        int k = array.length;
        int f = array[0];
        for (int i=0; i < k-1; i++) {
            array[i] = array[i+1];
        }
        array[k-1] = f;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        int k = array.length;
        n = n % k;
        // last n elements
        int[] lastN = new int[n];
        System.arraycopy(array, k-n, lastN, 0, n);
        for (int i = array.length - 1; i >= n; i--) {
            array[i] = array[i - n];
        }
        System.arraycopy(lastN, 0, array, 0, n);
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        int k = array.length;
        n = n % k;
        int[] firstN = new int[n];
        System.arraycopy(array, 0, firstN, 0, n);
        for (int i = 0; i < array.length - n; i++) {
            array[i] = array[i + n];
        }
        System.arraycopy(firstN, 0, array, array.length - n, n);
    }


}

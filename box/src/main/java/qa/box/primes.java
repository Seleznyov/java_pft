package qa.box;

class Primes {
    public static boolean isPrimeFor(int x) {
        for (int i = 2; i < x; i += 1) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static boolean isPrimeWhile(int x) {
        int i = 2;
        while (i < x) {
            if (x % i == 0) {
                return false;
            }
            i += 1;
        }
        return true;
    }

    public static boolean isPrimeFaste(int x) {
        int m=(int) Math.sqrt(x);
        for (int i = 2; i < m; i += 1) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}

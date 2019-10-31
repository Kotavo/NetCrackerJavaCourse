public class MyFactorial {
    public static long loopFactorial(int value) {
        if (value <= 1) {
            return 1;
        } else {
            long result = 1;
            for (int i = 1; i <= value; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static long recursionFactorial(int value) {
        long result = 1;
        if (value <= 1) {
            return 1;
        } else {
            result = value * recursionFactorial(value - 1);
            return result;
        }
    }
}


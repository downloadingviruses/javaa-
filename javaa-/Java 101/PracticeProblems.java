public class PracticeProblems {
    public static int countOccurrences(int[] arr, int n) {
        int count = 0;
        for (int num : arr) {
            if (num == n) {
                 count++;
            }
        }
        return count;
    }
    public static int[] reverseArray(int[] arr) {
        int[] reversedArr = new int[arr.length];
        int j = 0;
    
        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArr[j] = arr[i];
            j++;
        }
    
        return reversedArr;
    }
    public static double sumGrid(double[][] grid) {
        double sum = 0;

        for (double[] row : grid) {
            for (double value : row) {
                sum += value;
            }
        }

        return sum;
    }
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}


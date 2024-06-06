public class fizzbuzz {

    public static void main(String[] args) {
        printFizzBuzz();
    }

    public static void printFizzBuzz() {
        for (String result : fizzBuzz(1, 100)) {
            System.out.println(result);
        }
    }

    public static String[] fizzBuzz(int n, int m) {
        String[] results = new String[m - n + 1];
        for (int i = n; i <= m; i++) {
            results[i - n] = fizzBuzz(i);
        }
        return results;
    }

    public static String fizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(n);
        }
    }
}
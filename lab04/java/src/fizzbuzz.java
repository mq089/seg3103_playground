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
        String result = "";
        if (n % 3 == 0 && n % 5 == 0) {
            result = "FizzBuzz";
        } else if (n % 3 == 0) {
            result = "Fizz";
        } else if (n % 5 == 0) {
            result = "Buzz";
        } else {
            result = Integer.toString(n);
        }
        return result;
    }
}
package arithmeticTest;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        function("numbersFile1");
    }

    public static void function(String path) throws IOException {
        FileReader fileReader = new FileReader("src/main/resources/" + path + ".txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String[] line = bufferedReader.readLine().split(" ");
        List<Long> numbers = new ArrayList<>();
        for (String string : line) {
            numbers.add(Long.parseLong(string));
        }
        System.out.println("Минимальное: " + _min(numbers));
        System.out.println("Максимальное: " + _max(numbers));
        System.out.println("Сумма: " + _sum(numbers));
        System.out.println("Произведение: " + _mult(numbers));
    }

    public static long _min(List<Long> arr) {
        long min = Long.MAX_VALUE;
        for (long a : arr) {
            if (a < min) {
                min = a;
            }
        }
        return min;
    }

    public static long _max(List<Long> arr) {
        long max = Long.MIN_VALUE;
        for (long a : arr) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }

    public static long _sum(List<Long> arr) {
        long sum = 0;
        for (long a : arr) {
            sum += a;
        }
        return sum;
    }

    public static long _mult(List<Long> arr) {
        long mult = 1;
        for (long a : arr) {
            mult *= a;
        }
        return mult;
    }
}

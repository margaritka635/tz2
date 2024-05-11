package arithmeticTest;

import org.apache.commons.io.FileDeleteStrategy;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class Speed {

    public static long[] num;
    public static long[] time;

    public static void main(String[] args) throws IOException, InterruptedException {
        String fileName;
        long startTime;
        long endTime;
        long elapsedTime;
        PrintStream originalOut = System.out;
        File fileForOutput = new File("src/main/resources/fileForOutput.txt");
        System.setOut(new PrintStream(fileForOutput));
        Main.main(new String[]{});
        System.setOut(originalOut);
        System.gc();
        FileDeleteStrategy.FORCE.delete(fileForOutput);
        num = new long[] {4, 100, 1000, 10000, 100000};
        time = new long[5];
        for (int i = 1; i <= 5; ++i) {
            fileName = "numbersFile" + i;
            startTime = System.currentTimeMillis();
            Main.function(fileName);
            endTime = System.currentTimeMillis();
            elapsedTime = endTime - startTime;
            time[i - 1] = elapsedTime;
            System.out.println("Time taken: " + elapsedTime + " milliseconds");
        }
    }
}

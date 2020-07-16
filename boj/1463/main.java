import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n+1];
        int count = 0;
        for (int i = 2; i <= n; ++i) {
            numbers[i] = numbers[i-1] + 1;
            if (i % 2 == 0)
                numbers[i] = numbers[i] > numbers[i/2] ? numbers[i/2]+1 : numbers[i];
            if (i % 3 == 0)
                numbers[i] = numbers[i] > numbers[i/3] ? numbers[i/3]+1 : numbers[i];
        }
        System.out.println(numbers[n]);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split("");
        br.close();
        int[] count = new int[10];
        for (int i = 0; i < num.length; ++i) {
            int n = Integer.parseInt(num[i]);
            n = n == 9 ? 6 : n;
            ++count[n];
        }
        count[6] = (count[6]+1)/2;
        int max = 0;
        for (int i = 0; i < 10; ++i) {
            max = max > count[i] ? max : count[i];
        }
        System.out.println(max);
    }
}

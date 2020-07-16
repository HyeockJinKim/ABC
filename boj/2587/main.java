import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; ++i) {
            a[i] = Integer.parseInt(br.readLine());
            sum += a[i];
        }
        br.close();
        Arrays.sort(a);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum/5));
        bw.newLine();
        bw.write(String.valueOf(a[2]));
        bw.close();
    }
}

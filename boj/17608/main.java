import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            int t = Integer.parseInt(br.readLine());
            arr[i] = t;
        }
        int cur = 0;
        int count = 0;
        for (int i = n-1; i >= 0; --i) {
            if (cur < arr[i]) {
                cur = arr[i];
                ++count;
            }
        }
        bw.write(String.valueOf(count));
        br.close();
        bw.close();
    }

}
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.valueOf(br.readLine());
        int m = 1000000;
        int len = (int) (n % 1500000);
        int[] f = new int[len+1];
        if (len > 0)
            f[1] = 1;
        for (int i = 2; i < f.length; ++i) {
            f[i] = (f[i-1] + f[i-2])%m;
        }
        bw.write(String.valueOf(f[len]));
        bw.close();
        br.close();
    }
}

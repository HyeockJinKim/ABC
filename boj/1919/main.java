import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toCharArray();
        char[] b = br.readLine().toCharArray();
        int[] count = new int[30];
        br.close();
        for (int i = 0; i < a.length; ++i) {
            ++count[a[i]-'a'];
        }
        for (int i = 0; i < b.length; ++i) {
            --count[b[i]-'a'];
        }

        int num = 0;
        for (int i = 0; i < 30; ++i) {
            if (count[i] > 0) {
                num += count[i];
            } else if (count[i] < 0) {
                num -= count[i];
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(num));
        bw.close();
    }
}

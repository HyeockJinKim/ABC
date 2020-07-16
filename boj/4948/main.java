import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] check = new boolean[246913];
        check[0] = true;
        check[1] = true;
        int len = (int)Math.sqrt(check.length)+1;
        for (int i = 2; i <= len; ++i) {
            if (!check[i]) {
                for (int j = i*i; j < check.length; j+=i) {
                    check[j] = true;
                }
            }
        }
        int t = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (t != 0) {
            int temp = t*2;
            int count = 0;
            for (int i = t+1; i <= temp; ++i) {
                if (!check[i]) ++count;
            }
            bw.write(String.valueOf(count));
            bw.newLine();
            t = Integer.parseInt(br.readLine());
        }
        br.close();
        bw.close();
    }
}

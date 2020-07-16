import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < t; ++i) {
            char[] par = br.readLine().toCharArray();
            int count = 0;
            for (int j = 0; j < par.length; ++j) {
                if (par[j] == '(') {
                    ++count;
                } else {
                    --count;
                }
                if (count < 0) {
                    break;
                }
            }
            if (count != 0) {
                bw.write("NO");
            } else {
                bw.write("YES");
            }
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}

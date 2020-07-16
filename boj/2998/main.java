import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] bin = br.readLine().toCharArray();
        br.close();
        int mod = bin.length%3;
        int sum = 0, dub = 1;
        for (int i = mod-1; i >= 0; --i) {
            sum += dub*(bin[i]-'0');
            dub *= 2;
        }
        if (sum != 0) {
            bw.write(String.valueOf(sum));
        }
        for (int i = mod; i <= bin.length-3; i += 3) {
            sum = (bin[i]-'0')*4+(bin[i+1]-'0')*2+(bin[i+2]-'0');
            bw.write(String.valueOf(sum));
        }
        bw.close();
    }
}

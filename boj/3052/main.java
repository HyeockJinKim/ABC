import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; ++i) {
            set.add(Integer.parseInt(br.readLine())%42);
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(set.size()));
        bw.close();
    }
}

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int n, m;
        n = Integer.parseInt(tokenizer.nextToken());
        m = Integer.parseInt(tokenizer.nextToken());
        br.close();
        ArrayList<Integer> josep = new ArrayList<>();
        int index = m-1;
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 1; i <= n; ++i) {
            numList.add(i);
        }
        josep.add(numList.remove(index));
        while (!numList.isEmpty()) {
            index = (index-1 + m) % numList.size();
            josep.add(numList.remove(index));
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("<");
        for (int i = 0; i < n-1; ++i) {
            bw.write(String.format("%d, ", josep.get(i)));
        }
        bw.write(String.format("%d>", josep.get(n-1)));
        bw.newLine();
        bw.close();
    }
}

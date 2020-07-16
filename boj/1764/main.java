import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static String[] a;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int n, m;
        n = Integer.parseInt(tokenizer.nextToken());
        m = Integer.parseInt(tokenizer.nextToken());

        a = new String[n];
        for (int i = 0; i < n; ++i) {
            a[i] = br.readLine();
        }
        Arrays.sort(a);
        ArrayList<String> b = new ArrayList<>();
        for (int i = 0; i < m; ++i) {
            String t = br.readLine();
            int index = binarySearch(t);
            if (index != -1)
                b.add(a[index]);
        }
        br.close();
        String[] result = b.toArray(new String[0]);
        Arrays.sort(result);

        StringBuilder sb = new StringBuilder();

        sb.append(result.length).append("\n");
        for (int i = 0; i < result.length; ++i) {
            sb.append(result[i]).append("\n");
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.close();
    }

    private static int binarySearch(String str) {
        int low = 0;
        int high = a.length -1;
        while (low <= high) {
            int mid = (low+high)/2;
            if (a[mid].compareTo(str) < 0) {
                low = mid+1;
            } else if (a[mid].compareTo(str) > 0) {
                high = mid-1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static class Item {
        int index;
        int loc;

        Item(int index, int loc) {
            this.index = index;
            this.loc = loc;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());

        if (n >= k) {
            bw.write(String.valueOf(n-k));
            bw.write("\n");
            for (int i = n; i >= k; --i) {
                bw.write(String.valueOf(i));
                bw.write(" ");
            }
        } else {
            Queue<Item> queue = new LinkedList<>();
            queue.add(new Item(0, n));
            Integer[] par = new Integer[200001];

            Item result;
            while (true) {
                result = queue.poll();
                if (result == null) {
                    return;
                }
                int loc = result.loc;
                if (loc == k) {
                    break;
                }
                if (loc - 1 > 0 && par[loc - 1] == null) {
                    queue.add(new Item(result.index + 1, loc - 1));
                    par[loc - 1] = loc;
                }
                if (loc + 1 < 200000 && par[loc + 1] == null) {
                    queue.add(new Item(result.index + 1, loc + 1));
                    par[loc + 1] = loc;
                }
                if (loc * 2 < 200000 && par[loc * 2] == null) {
                    queue.add(new Item(result.index + 1, loc * 2));
                    par[loc * 2] = loc;
                }
            }

            bw.write(String.valueOf(result.index));
            bw.write("\n");
            recursive(bw, par, result.loc, n);
        }
        br.close();
        bw.close();
    }

    private static void recursive(BufferedWriter bw, Integer[] par, int loc, int first) throws IOException {
        if (loc == first) {
            bw.write(String.valueOf(loc));
            bw.write(" ");
            return;
        }

        recursive(bw, par, par[loc], first);
        bw.write(String.valueOf(loc));
        bw.write(" ");
    }
}
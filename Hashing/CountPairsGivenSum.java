import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Map;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Spandan Mishra
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        PairsWithGivenSum solver = new PairsWithGivenSum();
        solver.solve(1, in, out);
        out.close();
    }

    static class PairsWithGivenSum {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int t = in.readInt();

            while (t-- > 0) {
                int n = in.readInt();
                int k = in.readInt();

                int[] a = new int[n];
                Map<Integer, Integer> map = new HashMap<>();
                int cnt;
                for (int i = 0; i < n; i++) {
                    a[i] = in.readInt();
                    cnt = map.getOrDefault(a[i], 0);
                    map.put(a[i], cnt + 1);
                }

                cnt = 0;
                int val;
                for (int x : map.keySet()) {
                    if (map.containsKey(k - x)) {
                        //2 cases -- k-x is different or k-x  = x
                        if (k - x == x) {
                            val = map.get(x);
                            cnt += val * (val - 1) / 2;
                            map.put(x, 0);

                        } else {
                            cnt += map.get(x) * map.get(k - x);
                            map.put(x, 0);
                            map.put(k - x, 0);
                        }
                    }
                }

                System.out.println(cnt);
            }
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new RuntimeException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int readInt() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}



import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

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
        EqualArrays solver = new EqualArrays();
        solver.solve(1, in, out);
        out.close();
    }

    static class EqualArrays {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int t = in.readInt();

            while (t-- > 0) {
                int n = in.readInt();
                long[] a = new long[n];
                long[] b = new long[n];

                Map<Long, Integer> map = new HashMap<>();
                int cnt;
                for (int i = 0; i < n; i++) {
                    a[i] = in.readInt();
                    cnt = map.getOrDefault(a[i], 0);
                    map.put(a[i], cnt + 1);

                }

                for (int i = 0; i < n; i++)
                    b[i] = in.readInt();

                boolean flag = true;
                for (int i = 0; i < n; i++) {
                    if (!map.containsKey(b[i])) {
                        flag = false;
                        break;
                    } else {
                        cnt = map.get(b[i]);
                        if (cnt < 0) {
                            flag = false;
                            break;
                        }
                        map.put(b[i], cnt - 1);

                    }
                }
                if (flag) {
                    for (int x : map.values()) {
                        if (x != 0) {
                            flag = false;
                            break;
                        }
                    }
                }

                System.out.println(flag ? 1 : 0);
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



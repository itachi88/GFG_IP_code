package Chelper_codes_gen;

import FastIO.InputReader;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class FirstButSecond {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int t = in.readInt();

        while (t-- > 0) {
            int n = in.readInt();
            int m = in.readInt();

            long[] a = new long[n];
            long[] b = new long[m];

            for (int i = 0; i < n; i++)
                a[i] = in.readLong();

            Map<Long, Integer> map = new HashMap<>();
            int cnt;
            for (int i = 0; i < m; ++i) {
                b[i] = in.readLong();
                cnt = map.getOrDefault(b[i], 0);
                map.put(b[i], cnt + 1);
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n; i++) {
                if (!map.containsKey(a[i]))
                    sb.append(a[i] + " ");
            }

            System.out.println(sb);

        }

    }
}

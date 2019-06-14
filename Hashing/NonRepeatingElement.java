package Chelper_codes_gen;

import FastIO.InputReader;

import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingElement {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int t = in.readInt();

        while (t-- > 0) {
            int n = in.readInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++)
                a[i] = in.readLong();

            Map<Long, Integer> map = new LinkedHashMap<>();
            int cnt;
            for (int i = 0; i < n; i++) {
                cnt = map.getOrDefault(a[i], 0);
                map.put(a[i], cnt + 1);
            }
            boolean flag = false;
            for (long x : map.keySet()) {
                if (map.get(x) == 1) {
                    System.out.println(x);
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.println(0);
        }
    }
}

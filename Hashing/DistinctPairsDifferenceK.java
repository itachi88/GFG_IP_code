package Chelper_codes_gen;

import FastIO.InputReader;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class DistinctPairsDifferenceK {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int t = in.readInt();

        while (t-- > 0) {
            int n = in.readInt();
            int[] a = new int[n];

            Map<Integer, Integer> map = new HashMap<>();
            int cnt;
            for (int i = 0; i < n; i++) {
                a[i] = in.readInt();
                cnt = map.getOrDefault(a[i], 0);
                map.put(a[i], cnt + 1);
            }

            cnt = 0;
            int k = in.readInt();
            for (int x : map.keySet()) {
                if (map.containsKey(k + x)) {
                    if (k + x == x) {
                        cnt = map.get(x) > 1 ? cnt + 1 : cnt;
                    } else
                        cnt++;
                }
            }

            System.out.println(cnt);
        }
    }
}

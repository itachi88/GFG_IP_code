package Chelper_codes_gen;

import FastIO.InputReader;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class KeyPair {
    public void solve(int testNumber, InputReader in, PrintWriter out) {

        int t = in.readInt();

        while (t-- > 0) {
            int n = in.readInt();
            int sum = in.readInt();

            int[] a = new int[n];
            Map<Integer, Integer> map = new HashMap<>();
            int cnt;
            for (int i = 0; i < n; ++i) {
                a[i] = in.readInt();
                cnt = map.getOrDefault(a[i], 0);
                map.put(a[i], cnt + 1);
            }

            boolean flag = false;
            for (int x : map.keySet()) {
                if (map.containsKey(sum - x)) {
                    if (sum - x == x && map.get(x) <= 1) {
                        flag = false;
                        break;

                    }
                    flag = true;
                    break;
                }
            }

            System.out.println(flag ? "Yes" : "No");
        }
    }
}

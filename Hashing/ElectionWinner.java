package Chelper_codes_gen;

import FastIO.InputReader;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class ElectionWinner {
    public void solve(int testNumber, InputReader in, PrintWriter out) {

        int t = in.readInt();

        while (t-- > 0) {
            int n = in.readInt();

            String[] str = new String[n];

            for (int i = 0; i < n; ++i)
                str[i] = in.readString();

            Map<String, Integer> map = new HashMap<>();

            int cnt;
            for (int i = 0; i < n; i++) {
                cnt = map.getOrDefault(str[i], 0);
                map.put(str[i], cnt + 1);

            }

            int max = 0;
            int val;
            String ans = "";
            for (String s : map.keySet()) {
                val = map.get(s);
                if (val > max) {
                    max = val;
                    ans = s;
                } else if (val == max) {
                    if (ans.compareTo(s) > 0)
                        ans = s;
                    
                }
            }

            System.out.println(ans + " " + max);
        }
    }
}

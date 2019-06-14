package Chelper_codes_gen;

import FastIO.InputReader;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class SimpleFraction {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int t = in.readInt();

        while (t-- > 0) {
            int n = in.readInt();
            int d = in.readInt();

            System.out.println(n / d + ((n % d == 0) ? "" : ("." + decimal(n, d))));
        }
    }

    String decimal(int n, int d) {

        Map<Integer, Integer> map = new HashMap<>();

        // since rational numbers will either repeat or terminate
        int rem;
        int i = 0; // index

        boolean rec = true; //flag to check recurring or not
        StringBuilder sb = new StringBuilder();
        while (true) {
            rem = n % d;
            n = rem * 10;
            if (!map.containsKey(rem)) {
                map.put(rem, i++);

                if (rem != 0)
                    sb.append(n / d);

                else {
                    rec = false;
                    break;
                }
            } else {
                i = map.get(rem);
                break;
            }
        }

        if (!rec)
            return sb.toString();


        else {
            //My String has the decimal part. Now I need to parenthesize from index till string.length
            StringBuilder res = new StringBuilder();

            for (int k = 0; k < sb.length(); k++) {
                if (k == i)
                    res.append("(" + sb.charAt(k));
                else
                    res.append(sb.charAt(k));
            }

            res.append(")");
            return res.toString();
        }
    }
}

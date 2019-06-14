package Chelper_codes_gen;

import FastIO.InputReader;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FourSumNumbers {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int t = in.readInt();

        while (t-- > 0) {
            int n = in.readInt();
            int sum = in.readInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = in.readInt();

            Arrays.sort(a);
            StringBuilder sb = new StringBuilder();
            Set<String> set = new HashSet<>();
            for (int i = 0; i < n - 3; i++) {
                for (int j = i + 1; j < n - 2; j++) {
                    for (int k = j + 1; k < n - 1; k++) {
                        for (int l = k + 1; l < n; l++) {
                            if (a[i] + a[j] + a[k] + a[l] == sum) {
                                if (!set.contains(a[i] + " " + a[j] + " " + a[k] + " " + a[l] + " " + "$")) {
                                    set.add(a[i] + " " + a[j] + " " + a[k] + " " + a[l] + " " + "$");
                                    sb.append(a[i] + " " + a[j] + " " + a[k] + " " + a[l] + " " + "$");
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(sb.length() == 0 ? -1 : sb.toString());
        }


    }
}

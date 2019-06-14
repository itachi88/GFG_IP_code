package Chelper_codes_gen;

import FastIO.InputReader;

import java.io.PrintWriter;
import java.util.Arrays;

public class LargestFibonacciSequence {
    static int[] fib = fibGen(1001);

    public void solve(int testNumber, InputReader in, PrintWriter out) {

        int t = in.readInt();

        while (t-- > 0) {
            int n = in.readInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = in.readInt();

//            for (int i = 0; i < fib.length; i++)
//                System.out.println(i + " " + fib[i]);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (fib[a[i]] == 1) {
                    sb.append(a[i] + " ");
                }
            }

            System.out.println(sb);
        }
    }

    static int[] fibGen(int n) {

        int[] fib = new int[n];
        Arrays.fill(fib, 0);
        fib[0] = 1;
        fib[1] = 1;
        int i = 2, j = 1;
        int temp;
        while (i < n) {
            fib[i] = 1;
            temp = i;
            i = i + j;
            j = temp;
        }

        return fib;
    }
}

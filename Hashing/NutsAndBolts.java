package Chelper_codes_gen;

import FastIO.InputReader;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NutsAndBolts {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int t = in.readInt();
        while (t-- > 0) {
            int n = in.readInt();
            List<Character> nuts = new ArrayList<>();
            List<Character> bolts = new ArrayList<>();

            char c;
            for (int i = 0; i < n; i++) {
                c = (char) in.read();
                if (!in.isSpaceChar(c))
                    nuts.add(c);
                else
                    i--;
            }

            for (int i = 0; i < n; i++) {
                c = (char) in.read();
                if (!in.isSpaceChar(c))
                    bolts.add(c);
                else
                    i--;
            }

            nuts.sort(new Comparator<Character>() {
                @Override
                public int compare(Character o1, Character o2) {
                    if (weight(o1) >= weight(o2))
                        return -1;
                    else return 1;
                }
            });

            StringBuilder sb = new StringBuilder();

            for (char d : nuts)
                sb.append(d + " ");

            System.out.println(sb);
            System.out.println(sb);
        }

    }

    public int weight(Character c) {
        if (c == '!')
            return 9;
        else if (c == '#')
            return 8;
        else if (c == '$')
            return 7;
        else if (c == '%')
            return 6;
        else if (c == '&')
            return 5;
        else if (c == '*')
            return 4;
        else if (c == '@')
            return 3;
        else if (c == '^')
            return 2;
        else if (c == '~')
            return 1;
        else
            return -1;
    }

}


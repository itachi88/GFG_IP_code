package Chelper_codes_gen;

import FastIO.InputReader;

import java.io.PrintWriter;
import java.util.*;

public class GroupAnagramsTogether {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int t = in.readInt();

        while (t-- > 0) {
            int n = in.readInt();

            String[] s = new String[n];

            for (int i = 0; i < n; i++)
                s[i] = in.readString();


            Map<String, Integer> map = new HashMap<>();
            map.put(s[0], 1);
            boolean touched;
            int cnt;
            for (int i = 1; i < n; i++) {
                touched = false;
                for (String ss : map.keySet()) {
                    if (isAnagram(ss, s[i])) {
                        cnt = map.get(ss);
                        map.put(ss, cnt + 1);
                        touched = true;
                        break;
                    }
                }

                if (!touched)
                    map.put(s[i], 1);


//                Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
//                while (it.hasNext()) {
//                    if (isAnagram(it.next().getKey(), s[i])) {
//                        cnt = it.next().getValue();
//                        map.put(it.next().getKey(), cnt + 1);
//                        break;
//                    }
//                    else{
//                        map.put()
//                    }
//                }

            }

            List<Integer> ls = new ArrayList<>();
            for (int x : map.values())
                ls.add(x);

            Collections.sort(ls);

            StringBuilder sb = new StringBuilder();

            for (int x : ls)
                sb.append(x + " ");

            System.out.println(sb);
        }
    }

    boolean isAnagram(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        int cnt;
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            cnt = map.getOrDefault(c, 0);
            map.put(c, cnt + 1);
        }

        boolean flag = true;

        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (!map.containsKey(c)) {
                flag = false;
                break;
            } else {
                cnt = map.get(c);
                if (cnt - 1 < 0) {
                    flag = false;
                    break;
                }

                map.put(c, cnt - 1);
            }
        }

        return flag;
    }
}

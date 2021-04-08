package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
public class EqualBitwiseOperation {




        static long modExp(long x, long y, long mod) {
            if(y == 0)
                return 1 % mod;
            long ret = modExp(x, y >> 1, mod);
            ret = ret * ret % mod;
            if((y & 1) == 1)
                ret = ret * (x % mod) % mod;
            return ret;
        }

        public static void main(String[] args) {
            FastReader s = new FastReader();
            PrintWriter w = new PrintWriter(System.out);

            long mod = (long)1e9 + 7;
            long[] fact = new long[(int)2e5 + 1];
            long[] ifact = new long[(int)2e5 + 1];
            fact[0] = 1;
            ifact[0] = 1;
            for(int i = 1; i <= (int)2e5; i++) {
                fact[i] = fact[i - 1] * i % mod;
                ifact[i] = modExp(fact[i], mod - 2, mod);
            }

            int n = s.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++)
                a[i] = s.nextInt();
            HashMap<Integer, Integer> hm = new HashMap<>();
            for(int i = 0; i < n; i++) {
                if(!hm.containsKey(a[i]))
                    hm.put(a[i], 0);
                hm.put(a[i], hm.get(a[i]) + 1);
            }
            long res = 0;
            for(Map.Entry<Integer, Integer> e : hm.entrySet()) {
                int k = e.getKey();
                int c = e.getValue();
                if(k == 0) {
                    res = ((modExp(2, c, mod) - 1 + mod) % mod + res) % mod;
                    continue;
                }
                for(int i = 1; i <= c; i+=2) {
                    res = (fact[c] * ifact[i] % mod * ifact[c - i] % mod + res) % mod;
                }
            }
            w.print(res);

            w.close();
        }
        static class FastReader {
            BufferedReader br;
            StringTokenizer st;
            public FastReader() {
                br = new BufferedReader(new InputStreamReader(System.in));
            }
            String next() {
                while (st == null || !st.hasMoreTokens()) {
                    try {
                        st = new StringTokenizer(br.readLine());
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return st.nextToken();
            }
            int nextInt() {
                return Integer.parseInt(next());
            }
            long nextLong() {
                return Long.parseLong(next());
            }
            double nextDouble() {
                return Double.parseDouble(next());
            }
            String nextLine() {
                String str = "";
                try {
                    str = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return str;
            }
        }

}

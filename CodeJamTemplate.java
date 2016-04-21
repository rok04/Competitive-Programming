package String;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CodeJamTemplate {
	public static PrintWriter cout;
	static boolean fileinpput = true;

	public static void main(String[] args) throws FileNotFoundException {
		MyScanner sc;
		sc = new MyScanner();
		char[] hash = new char[27];
		for(int i=0;i<26;i++)
		{
			hash[i]=(char)(i+'a');
		}
		hash['z'-'a']='q';
		hash['q'-'a']='z';
		cout = new PrintWriter((System.out));
		
		for (int ii = 0; ii < 3; ii++) {
			String nextLine = sc.nextLine();
			String sol = sc.nextLine();

			String[] a = nextLine.split(" ");
			String[] b = sol.split(" ");

			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length(); j++) {
					hash[a[i].charAt(j) - 'a'] = (char) (b[i].charAt(j));
				}
			}
		}
		int n = sc.nextInt();
		for (int tt = 1; tt <= n; tt++) {
			String aa = sc.nextLine();
			String[] bb = aa.split(" ");
			cout.print("Case #" + tt + ": ");
			for (int i = 0; i < bb.length; i++) {
				for (int j = 0; j < bb[i].length(); j++) {
				
					cout.print((hash[(int)((char)(bb[i].charAt(j)-'a'))]));

				}
				cout.print(" ");

			}

			cout.println();

		}
		cout.close();

	}

	public static class MyScanner {
		static BufferedReader br;
		static StringTokenizer st;

		public MyScanner() throws FileNotFoundException {
			if (fileinpput == true) {
				String filename = "C:/Users/ryad22/Desktop/comp/CodeJam/in.txt";
				System.setIn(new FileInputStream(filename));
				System.setOut(new PrintStream("C:/Users/ryad22/Desktop/comp/CodeJam/out.txt"));
			}
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		static String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		static int nextInt() {
			return Integer.parseInt(next());
		}

		static long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		static String nextLine() {
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

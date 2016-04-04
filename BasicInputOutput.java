import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class BasicInputOutput {

	public static void main(String[] args) {
		InputStream in = System.in;
		OutputStream out = System.out;
		InputReader cin = new InputReader(in); 
		PrintWriter cout = new PrintWriter(out);
		
		int n, k, q;

	}

	static class InputReader {
		BufferedReader reader;
		StringTokenizer st;

		public InputReader(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
			st = null;
		}

		public String next() {
			while (st != null && st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(reader.readLine());

				} catch (IOException io) {
					throw new RuntimeException();
				}
			}
			return st.nextToken();

		}

		public Integer nextInt() {
			
			return Integer.parseInt(next());

		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public Long nextLong() {
			return Long.parseLong(next());

		}

	}
	

}

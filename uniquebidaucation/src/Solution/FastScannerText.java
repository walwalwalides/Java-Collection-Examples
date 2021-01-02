package Solution;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FastScannerText {	
	BufferedReader br = null;
//	BufferedReader br = new BufferedReader(new FileReader("test.txt"));
	StringTokenizer st = new StringTokenizer("");

	public String next() {
		while (!st.hasMoreElements())
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		return st.nextToken();
	}

	int nextInt() {
		return Integer.parseInt(next());
	}

	int[] readArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	long[] readLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}

	long nextLong() {
		return Long.parseLong(next());
	}
}

//		BufferedReader br = new BufferedReader(new FileReader("file.txt"));
//		try
//		{
//			StringBuilder sb = new StringBuilder();
//			String line = br.readLine();
//
//			while (line != null) {
//				sb.append(line);
//				sb.append(System.lineSeparator());
//				line = br.readLine();
//			}
//			String everything = sb.toString();
//		}
//
//		finally
//		{
//			br.close();
//		}
//

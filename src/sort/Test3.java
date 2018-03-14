package sort;

import java.net.URI;
import java.io.*;

public class Test3 {
	public static void main(String[] args) throws Exception {
		File file = new File("e:/demo", "test.txt");
		try {
			FileInputStream out = new FileInputStream(file);
			InputStreamReader in = new InputStreamReader(out);
			int ch = 0;
			while ((ch = in.read()) != -1) {
				System.out.print((char) ch);
			}
		} catch (Exception e) {
		}

	}
}

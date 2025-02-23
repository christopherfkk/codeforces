
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CF1399B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Begin code

		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {
			sc.nextLine();
			int N = sc.nextInt();
			sc.nextLine();

			List<Long> as = new ArrayList<>();
			List<Long> bs = new ArrayList<>();
			for (int n = 0; n < N; n++) {
				as.add(sc.nextLong());
			}
			sc.nextLine();
			for (int n = 0; n < N; n++) {
				bs.add(sc.nextLong());
			}
			long targetA = Collections.min(as);
			long targetB = Collections.min(bs);

			long res = 0;
			for (int i = 0; i < N; i++) {
				long diffA = as.get(i) - targetA;
				long diffB = bs.get(i) - targetB;
				res += diffA + diffB - Math.min(diffA, diffB);
			}
			System.out.println(res);
		}

		// End code
		sc.close();
	}
}

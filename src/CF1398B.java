
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CF1398B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Begin code

		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {
			sc.nextLine();
			TreeMap<Integer, Integer> runLengthFreq = new TreeMap<>(
					Comparator.reverseOrder());

			String binaryString = sc.next();
			int currL = 0;
			for (int i = 0; i < binaryString.length(); i++) {
				if (binaryString.charAt(i) == '1') {
					currL += 1;
				} else {
					if (currL > 0) {
						runLengthFreq.put(currL,
								runLengthFreq.getOrDefault(currL, 0) + 1);
					}
					currL = 0;
				}
			}
			runLengthFreq.put(currL, runLengthFreq.getOrDefault(currL, 0) + 1);

			int res = 0;
			boolean isAliceTurn = true;
			for (Map.Entry<Integer, Integer> entry : runLengthFreq.entrySet()) {
				int length = entry.getKey();
				int freq = entry.getValue();

				if (freq % 2 == 0) {
					res += length * (freq / 2);
					continue;
				}

				res += length * (freq / 2) + (isAliceTurn ? length : 0);
				isAliceTurn = !isAliceTurn;
			}
			System.out.println(res);
		}

		// End code
		sc.close();
	}
}

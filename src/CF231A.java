import java.util.Scanner;

public class CF231A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Begin code

		int n = sc.nextInt();
		sc.nextLine();

		int res = 0;
		for (int i = 0; i < n; i++) {
			String line = sc.nextLine();
			String[] parts = line.split(" ");
			int a = Integer.parseInt(parts[0]);
			int b = Integer.parseInt(parts[1]);
			int c = Integer.parseInt(parts[2]);
			if (a + b + c > 1) {
				res++;
			}
		}
		System.out.println(res);

		// End code
		sc.close();
	}
}
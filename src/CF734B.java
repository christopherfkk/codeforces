import java.util.Scanner;

public class CF734B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Begin code

		int k2 = sc.nextInt();
		int k3 = sc.nextInt();
		int k5 = sc.nextInt();
		int k6 = sc.nextInt();

		int n256 = Math.min(k2, Math.min(k5, k6));
		k2 -= n256;
		int n32 = Math.min(k2, k3);

		int res = 256 * n256 + 32 * n32;
		System.out.println(res);

		// End code
		sc.close();
	}
}
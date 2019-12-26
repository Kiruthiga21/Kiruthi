package Cluase;

public class SantaCluase {
	public static void main(String[] args) {
		int n = 7;
		int ans = 97;
		char res = (char) ans;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == i || i + j == n + 1) {
					System.out.print(res++);
				}

				System.out.print(" ");
			}

			System.out.println();
		}
	}
}

package Cluase;

public class SantaCluase {

	public static void main(String[] args) {
		int n = 7;
		int ans = 97;
		char res = (char) ans;
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == i || i + j == n + 1) {
					System.out.print(res++);
				}

				System.out.print(" ");
				
	
	}
		}
	}
			private void star() {
				int n = 5;
				for (int i = n; i > 0; i--) {
					for (int j = 1; j <= i; j++) {
						System.out.print("* ");

					}
					System.out.println();
				}
				System.out.println(1);
				System.out.println(2);
				System.out.println(3);
				System.out.println(4);
				System.out.println(5);
				System.out.println(6);
				System.out.println(7);
}
}

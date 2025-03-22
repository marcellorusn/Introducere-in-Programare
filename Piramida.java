import java.util.Scanner;

public class Piramida {
	private int n;

	public Piramida(int n) {
		this.n = n;
	}

	public void potrivita() {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < (n - i + 1); j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu numarul: ");
		int n = scanner.nextInt();

		Piramida piramida = new Piramida(n);
		piramida.potrivita();

		scanner.close();
	}
}

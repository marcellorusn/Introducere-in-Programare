import java.util.Scanner;

public class Piramida {
	private int n;

	public Piramida(int n) {
		this.n = n;
	}

	public String toString() {
		String piramidaStr = "";
		int index = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < index; j++) {
				piramidaStr += i + " ";
			}
			piramidaStr += "\n";
			index++;
		}

		return piramidaStr;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Piramida) {
			Piramida p = (Piramida) obj;
			return this.n == p.n;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu numarul: ");
		int n = scanner.nextInt();

		Piramida piramida = new Piramida(n);
		System.out.println(piramida);

		scanner.close();
	}
}

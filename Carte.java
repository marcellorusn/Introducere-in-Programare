
public class Carte {
	private int pagini;

	public Carte(int pagini) {
		this.pagini = pagini;

	}

	public String potrivita(Carte altaCarte) {
		if (this.pagini == altaCarte.pagini) {
			return "Cartile sunt la fel";
		} else {
			return "Nu sunt la fel";
		}
	}

	public static void main(String[] args) {
		Carte carte1 = new Carte(275);
		Carte carte2 = new Carte(120);
		Carte carte3 = new Carte(400);
		Carte carte4 = new Carte(275);

		System.out.println("Comparare carte1 cu carte2: " + carte1.potrivita(carte2));
		System.out.println("Comparare carte1 cu carte3: " + carte1.potrivita(carte3));
		System.out.println("Comparare carte1 cu carte4: " + carte1.potrivita(carte4));
	}

}

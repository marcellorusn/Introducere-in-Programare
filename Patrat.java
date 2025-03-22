
public class Patrat {
	private int l;

	public Patrat(int l) {
		this.l = l;
	}

	public Patrat() {
		this.l = 10;
	}

	public void potrivita() {
		int a = l * l;
		System.out.println("Patrat " + l + " Aria " + a);
	}
	public static void main(String[] args) {
		Patrat patrat1 = new Patrat(5);
		Patrat patrat2 = new Patrat(4);
		Patrat patrat3 = new Patrat(3);
		Patrat patrat4 = new Patrat(2);
		Patrat patrat5 = new Patrat();
		
		patrat1.potrivita();
		patrat2.potrivita();
		patrat3.potrivita();
		patrat4.potrivita();
		patrat5.potrivita();
	}
}
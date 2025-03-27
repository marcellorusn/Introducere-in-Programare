
public class Patrat {
	private int l;

	public Patrat(int l) {
		this.l = l;
	}

	public Patrat() {
		this.l = 10;
	}

	public String toString() {
		int aria = l * l;
		return "Patrat Latura=" + l + " Aria=" + aria;
	}

	public static void main(String[] args) {
		Patrat patrat1 = new Patrat(5);
		Patrat patrat2 = new Patrat(4);
		Patrat patrat3 = new Patrat(3);
		Patrat patrat4 = new Patrat(2);
		Patrat patrat5 = new Patrat();

		System.out.println(patrat1);
		System.out.println(patrat2);
		System.out.println(patrat3);
		System.out.println(patrat4);
		System.out.println(patrat5);
	}
}
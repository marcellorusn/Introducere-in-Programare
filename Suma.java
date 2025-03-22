/* returneaza suma dintre a si b
a) public static int suma(int a, int b) ...
//returneaza suma dintre a, b si c
b) public static int suma(int a, int b, int c) ...
// returneaza suma dintre a, b, c si d
c) public static int suma(int a, int b, int c, int d) ...*/

public class Suma {
	

	public static int suma(int a, int b) {
        return a + b;
    }

    
    public static int suma(int a, int b, int c) {
        return suma(a, b) + c;
    }

    
    public static int suma(int a, int b, int c, int d) {
        return suma(a, b, c) + d;
    }

    public static void main(String[] args) {
        System.out.println("Suma la a si b: " + suma(6, 7));
        System.out.println("Suma la a si b si c: " + suma(6, 7, 8));
        System.out.println("Suma la a si b si c si d: " + suma(6, 7, 8, 9));
    }
}



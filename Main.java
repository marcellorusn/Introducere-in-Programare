import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		try {
			File fisierIntervale = new File("intervale.dat");
			Scanner scannerIntervale = new Scanner(fisierIntervale);
			List<Interval> intervale = new ArrayList<>();

			while (scannerIntervale.hasNextLine()) {
				String linie = scannerIntervale.nextLine();
				String[] valori = linie.replace("[", "").replace("]", "").split(",");
				Double minim = Double.valueOf(valori[0].trim());
				Double maxim = Double.valueOf(valori[1].trim());
				intervale.add(new Interval(minim, maxim));
			}
			scannerIntervale.close();

			File fisierNumere = new File("numere.dat");
			Scanner scannerNumere = new Scanner(fisierNumere);
			Set<Double> numereCitite = new HashSet<>();

			while (scannerNumere.hasNext()) {
				if (scannerNumere.hasNextDouble()) {
					Double numar = scannerNumere.nextDouble();
					if (!numereCitite.add(numar)) {
						System.out.println("Eroare: numarul " + numar + " a fost deja citit");
					} else {
						for (Interval interval : intervale) {
							interval.testare(numar);
						}
					}
				} else {
					scannerNumere.next(); // Ignoră inputul invalid
				}
			}
			scannerNumere.close();

			PrintWriter writer = new PrintWriter("statistica.dat");
			for (Interval interval : intervale) {
				interval.scrieRezultate(writer);
				System.out.println(interval); // Afișează rezultatele în consolă
			}
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
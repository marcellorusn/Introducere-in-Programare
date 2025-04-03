import java.io.*;
import java.util.*;

class Interval {
	private Double minInterval, maxInterval;
	private int numereTestate;
	private int numereContinute;

	public Interval(Double minInterval, Double maxInterval) {
		this.minInterval = minInterval;
		this.maxInterval = maxInterval;
		this.numereTestate = 0;
		this.numereContinute = 0;
	}

	public void testare(Double numar) {
		numereTestate++;
		if (numar >= minInterval && numar <= maxInterval) {
			numereContinute++;
		}
	}

	public double aflaProcente() {
		if (numereTestate == 0)
			return 0;
		return (numereContinute * 100.0) / numereTestate;
	}

	public void scrieRezultate(PrintWriter writer) {
		writer.println("[" + minInterval + ", " + maxInterval + "] -> " + aflaProcente() + "%");
	}

	@Override
	public String toString() {
		return "[" + minInterval + ", " + maxInterval + "] -> " + aflaProcente() + "%";
	}
}

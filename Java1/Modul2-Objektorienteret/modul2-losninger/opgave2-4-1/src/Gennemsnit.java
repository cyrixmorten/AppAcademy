
public class Gennemsnit {
	public double beregnGennemsnit(double[] tal) {
		double total = 0;
		for (double d : tal) {
			total += d;
		}
		return total / tal.length;
	}
	
	public double beregnGennemsnit(int[] tal) {
		double total = 0;
		for (int i : tal) {
			total += i;
		}
		return total / tal.length;
	}
}

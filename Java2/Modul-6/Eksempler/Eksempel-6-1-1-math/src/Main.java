import java.util.*;

public class Main {

	public static void main(String[] args) {

		// Absolut værdi
		int absolut = Math.abs(-5);
		System.out.println("Absolut værdi Math.abs(-5): " + absolut);
		// Afrunding
		long afrunding = Math.round(2.5);
		System.out.println("Afrunding Math.round(2.5): " + afrunding);
		// Afrunding nedad
		double afrunding_ned = Math.floor(1.9);
		System.out.println("Afrunind nedad Math.floor(1.9): " + afrunding_ned);
		// Afrunding opad
		double afrunding_op = Math.ceil(1.1);
		System.out.println("Afrunding opad Math.ceil(1.1): " + afrunding_op);
		// Fortegn
		float minus = Math.signum(-5);
		System.out.println("Fortegn Math.signum(-5): " + minus);
		float nul = Math.signum(0);
		System.out.println("Fortegn Math.signum(0): " + nul);
		float plus = Math.signum(5);
		System.out.println("Fortegn Math.signum(5): " + plus);
		// Kubikrod
		double kubikrod = Math.cbrt(125);
		System.out.println("Kubikrod Math.cbrt(125): " + kubikrod);
		// Kvadratrod
		double kvadratrod = Math.sqrt(25);
		System.out.println("Kvadratrod Math.cbrt(25): " + kvadratrod);
		// Logaritmer
		double exp = Math.exp(1.2);
		System.out.println("Logaritmer Math.exp(1.2): " + exp);
		double log = Math.log(1.2);
		System.out.println("Logaritmer Math.log(1.2): " + log);
		double log10 = Math.log10(1.2);
		System.out.println("Logaritmer Math.log10(1.2): " + log10);
		// Mindste tal
		double min = Math.min(2, 5);
		System.out.println("Mindste tal Math.min(2, 5): " + min);		
		// Største tal
		double max = Math.max(2, 5);
		System.out.println("Største tal Math.max(2, 5): " + max);
		// Potens
		double potens = Math.pow(2, 5);
		System.out.println("Største tal Math.pow(2, 5): " + potens);
		// Tilfældig tal
		double random = Math.random();
		System.out.println("Tilfældig tal Math.random(): " + random);
		// Trigonometri
		double sin = Math.sin(2);
		System.out.println("Trigonometri Math.sin(2): " + sin);
		double cos = Math.cos(2);
		System.out.println("Trigonometri Math.cos(2): " + cos);
		double tan = Math.tan(2);
		System.out.println("Trigonometri Math.tan(2): " + tan);
		
	}

}

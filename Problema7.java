package laborator;

public class Problema7 {
	public boolean prim (int numar) {
		int div;
		for (div = 2; div <= numar/2; div++)
			if (numar % div == 0) return false;
		return true;
	}
	public void goldbach (int numar) {
		int k;
		for (k = 2; k <= numar / 2; k++) {
			Problema7 obj = new Problema7 ();
			boolean isTrue1 = obj.prim (k);
			int opp = numar - k;
			boolean isTrue2 = obj.prim (opp);
			if (isTrue1 == isTrue2 && isTrue1 == true)
				System.out.println (numar + " = " + k + " + " + opp);
		}
	}
	public static void main (String[] args) {
		// Am considerat ca n din enunt este 20.
		int n = 20;
		int i;
		// pentru 1 nu cred ca are sens, de aceea incep de la 2;
		for (i = 2; i <= n; i++) {
			Problema7 obj = new Problema7 ();
			obj.goldbach (i);
		}
	}
}

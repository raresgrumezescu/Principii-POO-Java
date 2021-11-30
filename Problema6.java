package laborator;

public class Problema6 {
	public boolean prim (int numar) {
		int div;
		for (div = 2; div <= numar/2; div++)
			if (numar % div == 0) return false;
		return true;
	}
	public static void main(String[] args) {
		int i;
		for (i = 1; i < 20; i++) {
			Problema6 obj = new Problema6 ();
			boolean isTrue = obj.prim (i);
			if (isTrue == true) System.out.println (i + " este prim");
			else System.out.println (i + " NU este prim");
		}
	}

}

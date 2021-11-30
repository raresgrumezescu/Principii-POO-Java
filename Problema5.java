package laborator;

public class Problema5 {
	public int putere (int baza, int exp) {
		if (exp == 0) return 1;
		else return baza * putere (baza, exp - 1);
	}
	public static void main(String[] args) {
		Problema5 rez = new Problema5();
		int numar = 3;
		int exp = 4;
		int rez1 = rez.putere(numar, exp);
		double rez2 = Math.pow(numar, exp);
		System.out.println (rez1 + " " + rez2);
	}

}

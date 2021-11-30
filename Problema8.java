package laborator;

public class Problema8 {
	public double[] arrayRandom () {
		double[] v = new double[5];
		int i;
		for (i = 0; i < 5; i++)
			v[i] = Math.random ();
		return v;
	}
	public static void main(String[] args) {
		Problema8 obj = new Problema8 (); 
		double[] v = obj.arrayRandom();
		java.util.Arrays.sort(v);
		int i;
		for (i = 0; i < 5; i++)
			System.out.println (v[i]);
		int poz = java.util.Arrays.binarySearch(v, v[3]);
		System.out.println (poz);
	}

}

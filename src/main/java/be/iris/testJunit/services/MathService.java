package be.iris.testJunit.services;

public class MathService {
	private int cpt = 0;
	public int somme(int nb1, int nb2) {
		return nb1 + nb2 + (cpt++);
	}
}

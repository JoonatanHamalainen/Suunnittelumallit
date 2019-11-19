package memento;

import java.util.Random;

public class Arvuuttaja {
	
	private String asiakas;
	private int numero;
	
	public Object liityPeliin(String asiakas) {
		this.asiakas = asiakas;
		Random random = new Random();
		int max = 10, min = 1;
		numero = (random.nextInt(max - min + 1) + min);
		
		return new Memento(this.asiakas, numero);
	}
	
	public boolean arvaus(Object arvo, int arvaus) {
		
		Memento memento = (Memento) arvo;
		
		this.asiakas = memento.asiakas;
		this.numero = memento.numero;
		
		System.out.println("Pelaajan " + asiakas + " arvaus: " + arvaus);
		System.out.println("Oikea numero: " + numero);
		
		if (arvaus == numero) {
			return true;
		}
		else {
			return false;
		}
	}

	private class Memento {
		private String asiakas;
		private int numero;

		public Memento(String asiakas, int numero) {
			this.asiakas = asiakas;
			this.numero = numero;
		}
	}
}

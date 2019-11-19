package memento;

import java.util.ArrayList;
import java.util.List;

public class Asiakas {
	
	private boolean voitto;

	public static void main(String[] args) {
		
		List<Boolean> pelaajat = new ArrayList<Boolean>();
		
		Arvuuttaja arvuuttaja = new Arvuuttaja();
		
		pelaajat.add(arvuuttaja.arvaus(arvuuttaja.liityPeliin("Pelaaja 1") , 1));
		pelaajat.add(arvuuttaja.arvaus(arvuuttaja.liityPeliin("Pelaaja 2") , 2));
		pelaajat.add(arvuuttaja.arvaus(arvuuttaja.liityPeliin("Pelaaja 3") , 3));
		pelaajat.add(arvuuttaja.arvaus(arvuuttaja.liityPeliin("Pelaaja 4") , 4));
		pelaajat.add(arvuuttaja.arvaus(arvuuttaja.liityPeliin("Pelaaja 5") , 5));
		
		for (int i=0; i<pelaajat.size(); i++) {
			
			String pelaaja = "Pelaaja " + (i+1);
		
		if (pelaajat.get(i))
			System.out.println(pelaaja + ": Voitit!");
		else
			System.out.println(pelaaja + ": Hävisit...");
	}
	}

}

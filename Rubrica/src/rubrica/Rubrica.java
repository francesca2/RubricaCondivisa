package rubrica;

import java.util.Map;
import java.util.TreeMap;

public class Rubrica {

	//Mappa contentente le voci di rubrica
private Map<String,Voce> rubrica = new TreeMap<String,Voce>();	

public Voce aggiungiVoce(String nome, String cognome, String telefono) throws VoceGi‡Esiste
{	
	
	if(rubrica.containsKey(nome + " " + cognome)){
		throw new VoceGi‡Esiste("Voce gi‡ registrata");
	}

	
	Voce v= new Voce(nome, cognome, telefono);
	rubrica.put(nome + " " + cognome, v);

   
	for(Voce v1:rubrica.values()){
	   System.out.println(v1.getNome());
		System.out.println("Ciao");
   }
	for(Voce v2:rubrica.values()){
		System.out.println(v2.getCognome());
		
	}
return v;
}

}

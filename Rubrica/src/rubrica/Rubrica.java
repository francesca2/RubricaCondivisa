package rubrica;

import java.util.Map;
import java.util.TreeMap;

public class Rubrica {

	//Mappa contentente le voci di rubrica
private Map<String,Voce> rubrica = new TreeMap<String,Voce>();	

private int a;
private String s;

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
		if(v.getNome()=="Viviana")
		{
			System.out.println("Il tuo nome Ë Viviana");
		}

		for(Voce v3:rubrica.values()){
			   System.out.println(v3.getTelefono());
				System.out.println("hello!");
				if(v.getTelefono().equals("55555"))
				{
					System.out.println("Il tuo telefono Ë" + v.getTelefono());
				}
		   }

	}
return v;
}

}

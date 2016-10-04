package rubrica;

import java.util.Map;
import java.util.TreeMap;

public class Rubrica {

	//Mappa contentente le voci di rubrica
private Map<String,Voce> rubrica = new TreeMap<String,Voce>();	

//Primo metodo aggiungi Voce
public Voce aggiungiVoce(String nome, String cognome, String telefono) throws VoceGi‡Esiste
{	

	if(rubrica.containsKey(nome + " " + cognome)){
		throw new VoceGi‡Esiste("Voce gi‡ registrata");
	}
	Voce v= new Voce(nome, cognome, telefono);
	rubrica.put(nome + " " + cognome, v);

return v;
}

//Secondo metodo getVoce, deve verificare che nome e cognome esistano altrimenti lancia una eccezione 

public Voce getVoce(String nome, String cognome)
{
	









//Terzo metodo getTutteLeVoci, deve restitutire tutte le voci in rubrica
public List<Voce> getListaVoci(){
	
}









//quarto metodo, deve lanciare una eccezione se nome e cognome non esistono in rubric
public Voce aggiornaVoce(String nome,Sting cognome,String telefono) throws VoceNonEsistente{
	
	if(!rubrica.containsKey(nome + " " + cognome)){
		throw new VoceNonEsistente("La voce non Ë registrata in rubrica");
	}

	Voce v=rubrica.get(nome + " " + cognome);
	v.setTelefono(telefono);
	 return v;
}

//quinto metodo
public Voce rimuoviVoce(String nome, String cognome) throws VoceNonEsistente{
	
	if(!rubrica.containsKey(nome + " " + cognome)) {
		throw new VoceNonEsistente("La voce non Ë registrata in rubrica");
	}
	
	Voce v=rubrica.get(nome + " " + cognome);
	rubrica.remove(nome + " " + cognome);
	return v;
	
}
}

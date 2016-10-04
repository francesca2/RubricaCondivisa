import java.util.List;
import rubrica.*;

public class MainRubrica {

	public static void main(String[] args) {
Rubrica rbr= new Rubrica();

try {
	rbr.aggiungiVoce("Francesca", "Giordani", "335577788");
} catch (VoceGi‡Esiste e) {
System.out.println(e.getMessage());
}
try {
	rbr.aggiungiVoce("Viviana", "Vacirca", "448822299");
} catch (VoceGi‡Esiste e) {
	System.out.println(e.getMessage());
}
try {
	rbr.aggiungiVoce("Paolino", "Paperino", "338866622");
} catch (VoceGi‡Esiste e) {
	System.out.println(e.getMessage());
}
//prova secondo metodo 
try {
	rbr.getVoce("Paki", "Paki");
} catch (VoceNonEsistente e) {
	System.out.println(e.getMessage());
}

try {
	rbr.getVoce("Paolino", "Paperino");
} catch (VoceNonEsistente e) {
	System.out.println(e.getMessage());
}
try {
	rbr.getVoce("Viviana", "Vacirca");
} catch (VoceNonEsistente e) {
	System.out.println(e.getMessage());
}

//prova terzo metodo

	List<Voce> VociRubrica=rbr.getListaVoci();
	for(Voce v:VociRubrica){
		System.out.println(v.getNome()+" "+v.getCognome()+" "+v.getTelefono());
	}


	
	try {
		Voce vaggiornata= rbr.aggiornaVoce("Paolino", "Paperino", "112255599");
		System.out.println("Il nuovo numero di " + vaggiornata.getNome() + " " + vaggiornata.getCognome() + " Ë: " + vaggiornata.getTelefono());
	} catch (VoceNonEsistente e) {
	System.out.println(e.getMessage());
	}

	try {
		rbr.aggiornaVoce("Archimede","Paperino", "886633377");
	} catch (VoceNonEsistente e) {
	System.out.println(e.getMessage());
	}

			


	try {
		Voce vrimossa=rbr.rimuoviVoce("Paolino", "Paperino");
		System.out.println("Ho rimosso la voce " + vrimossa.getNome() + " " + vrimossa.getCognome() + " " + vrimossa.getTelefono());
	} catch (VoceNonEsistente e) {
	System.out.println(e.getMessage());
	}
}
}
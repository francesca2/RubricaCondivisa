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
	rbr.aggiungiVoce("Viviana", "Varcica", "448822299");
} catch (VoceGi‡Esiste e) {
	System.out.println(e.getMessage());
}
try {
	rbr.aggiungiVoce("Paolino", "Paperino", "338866622");
} catch (VoceGi‡Esiste e) {
	System.out.println(e.getMessage());
}


		
	}

}

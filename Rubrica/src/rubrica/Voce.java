package rubrica;

public class Voce {

	private String nome;
	private String cognome;
	private String telefono;
	private char sesso;
		
	public Voce() {
	}
	
	public Voce(String nome, String cognome, String telefono) {
		this.nome = nome;
		this.cognome = cognome;
		this.telefono = telefono;
	}

	public Voce(String nome, String cognome, String telefono, char sesso) {
		this.nome = nome;
		this.cognome = cognome;
		this.telefono = telefono;
		this.sesso=sesso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public char getSesso() {
		return sesso;
	}

	public void setSesso(char sesso) {
		this.sesso = sesso;
	}
	
}

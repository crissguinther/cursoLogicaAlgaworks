package metodoinstancia;

public class Cliente {

	private String primeiroNome;
	private String ultimoNome;
	private String telefone;
	private String email;

	public Cliente(String primeiroNome, String ultimoNome, String telefone, String email) {
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.telefone = telefone;
		this.email = email;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getNomeCompleto() {
		return getPrimeiroNome() + " " + getUltimoNome();
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String obterDDD() {
		return getTelefone().substring(0, 2);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

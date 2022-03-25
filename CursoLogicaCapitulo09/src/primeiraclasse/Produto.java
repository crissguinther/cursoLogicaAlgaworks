package primeiraclasse;

public class Produto {

	private String nome;
	private Double precoUnitario;
	private Integer quantidade;

	public Produto() {

	}

	public Produto(String nome, Double precoUnitario, Integer quantidade) {
		this.nome = nome;
		this.precoUnitario = precoUnitario;
		this.quantidade = quantidade;
	}

	public Boolean estaEmFalta() {
		if (this.getQuantidade() < 10)
			return true;
		else
			return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(Double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

}

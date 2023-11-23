package entities;

public abstract class Item {
	
	private String nome_comercial;
	private String codigo_id;
	private Double preco_unitario;
	private Double preco_de_custo;
	
	public Item(String nome_comercial, String codigo_id, Double preco_unitario, Double preco_de_custo) {
		this.nome_comercial = nome_comercial;
		this.codigo_id = codigo_id;
		this.preco_unitario = preco_unitario;
		this.preco_de_custo = preco_de_custo;
	}

	//GETTERS AND SETTERS
    public abstract String getTipo();

	public String getNome_comercial() {
		return nome_comercial;
	}

	public void setNome_comercial(String nome_comercial) {
		this.nome_comercial = nome_comercial;
	}

	public String getCodigo_id() {
		return codigo_id;
	}

	public Double getPreco_unitario() {
		return preco_unitario;
	}

	public void setPreco_unitario(Double preco_unitario) {
		this.preco_unitario = preco_unitario;
	}

	public Double getPreco_de_custo() {
		return preco_de_custo;
	}

	public void setPreco_de_custo(Double preco_de_custo) {
		this.preco_de_custo = preco_de_custo;
	}

	public String toString() {
		return "O nome comercial do item cadastrado é: " + nome_comercial + ", codigo identificador: " + codigo_id + ", preço unitário: "
				+ String.format("%.2f", preco_unitario) + ", preco de custo: " + String.format("%.2f", preco_de_custo);
	}
}

package entities;

import java.time.LocalTime;
import java.util.List;

import interfaces.Exibir;

/*
Para cada sobremesa, as seguintes informações devem ser armazenadas: lista de
ingredientes (os quais são previamente cadastrados), descrição comercial do
prato, tempo de preparo e nro de calorias
 */

public class Sobremesa extends Item implements Exibir{

	private List<Ingrediente> ingrediente;
	private String descricao;
	private LocalTime tempo_preparo;
	private Double num_caloria;
	private static final Double valor_pago_cozinheiro = 50.00;


	//Construtor Sobremesa
	public Sobremesa(String nome_comercial, String codigo_id, Double preco_unitario, Double preco_de_custo,
			List<Ingrediente> ingrediente, String descricao, LocalTime tempo_preparo, Double num_caloria) {
		super(nome_comercial, codigo_id, preco_unitario, preco_de_custo);
		this.ingrediente = ingrediente;
		this.descricao = descricao;
		this.tempo_preparo = tempo_preparo;
		this.num_caloria = num_caloria;
	}

	//GETTERS AND SETTERS
	public static Double getValor_pago_cozinheiro() {
		return valor_pago_cozinheiro;
	}

	public List<Ingrediente> getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(List<Ingrediente> ingrediente) {
		this.ingrediente = ingrediente;
	}

	public String getDescricao() {
		return descricao;
	}

	public LocalTime getTempo_preparo() {
		return tempo_preparo;
	}

	public Double getNum_caloria() {
		return num_caloria;
	}

	@Override
	public String toString() {
		return super.toString() + ", os ingredientes da sobremesa são: " + ingrediente.toString() + ", descricao: "
				+ descricao + ", tempo de preparo: " + tempo_preparo + ", número de calorias: "
				+ String.format("%.2f", num_caloria);
	}

	@Override
	public String getTipo() {
		return "Sobremesa";
	}

	@Override
    public void exibirDetalhes() {
        System.out.println("Detalhes da Sobremesa: " + this.getNome_comercial() + " " + this.getDescricao());
    }
}

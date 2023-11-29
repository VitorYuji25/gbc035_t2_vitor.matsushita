package entities;

import java.time.LocalTime;
import java.util.List;

import enum_entites.Categoria;
import interfaces.Exibir;

/*
Para os pratos principais, as seguintes informações devem ser armazenadas: lista
de ingredientes (os quais são previamente cadastrados), descrição comercial do
prato e o tempo de preparo.
 */

public class Prato_Principal extends Item implements Exibir{

	private List<Ingrediente> ingrediente;
	private String descricao;
	private LocalTime tempo_preparo;
	private static final Double valor_pago_cozinheiro = 100.00;


	//Construtor Parto Principal
	public Prato_Principal(String nome_comercial, String codigo_id, Double preco_unitario, Double preco_de_custo,Categoria categoria,
			List<Ingrediente> ingrediente, String descricao, LocalTime tempo_preparo) {
		super(nome_comercial, codigo_id, preco_unitario, preco_de_custo,categoria);
		this.ingrediente = ingrediente;
		this.descricao = descricao;
		this.tempo_preparo = tempo_preparo;

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

	@Override
	public String toString() {
		return super.toString() + ", os ingrediente(s) do prato principal são: " + ingrediente.toString()
				+ ", descricao: " + descricao + ", tempo de preparo: " + tempo_preparo;
	}

	@Override
	public String getTipo() {
		return "Prato Principal";
	}

	@Override
    public void exibirDetalhes() {
        System.out.println("Detalhes do Prato Principal: " + this.getNome_comercial() + " " + this.getDescricao());
    }
}

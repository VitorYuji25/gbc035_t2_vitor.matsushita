package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import interfaces.Exibir;

/*
- Os cozinheiros do restaurante precisam ser cadastrados. Para cada cozinheiro
deve-se armazenar: nome, CPF, RG, estado civil, endereço completo, quais
comidas do cardápio ele consegue fazer (entre prato principal e sobremesa),
carteira de trabalho, data de admissão.
- O salário mensal dos cozinheiros é contabilizado pelo itens do pedido que ele
preparou, sendo que há um valor único para prato principal e um para sobremesa
 */

public class Cozinheiro extends Funcionario implements Exibir{

	private List<Item> comida_cardapio;

	public Cozinheiro(String nome, String CPF, String RG, String estado_civil, String endereco, LocalDate data_admissao,
			String num_carteira_trabalho, List<Item> comida_cardapio) {
		super(nome, CPF, RG, estado_civil, endereco, data_admissao, num_carteira_trabalho);
		this.comida_cardapio = new ArrayList<>();
	}

	public Double calcularSalario(List<Item> comida_cardapio) {
		int totalPratosPrincipais = 0;
		int totalSobremesas = 0;
		int totalBebidas = 0;

		for (Item item : comida_cardapio) {
			if (item instanceof Prato_Principal) {
				totalPratosPrincipais++;
			} else if (item instanceof Sobremesa) {
				totalSobremesas++;
			} else if (item instanceof Bebida) {
				totalBebidas++;
			}
		}

		double salarioTotal = (totalPratosPrincipais * Prato_Principal.getValor_pago_cozinheiro())
				+ (totalSobremesas * Sobremesa.getValor_pago_cozinheiro())
				+ (totalBebidas * Bebida.getValor_pago_cozinheiro());
		return salarioTotal;
	}

	public void adicionarItemAoCardapio(Item item) {
		comida_cardapio.add(item);
	}

	public String MostrarCardapio(List<Item> comida_cardapio) {
	    StringBuilder cardapio = new StringBuilder("As comidas do cardápio são: \n");

	    for (Item item : comida_cardapio) {
	        cardapio.append(item.getNome_comercial() + ", seu código identificador é: " + item.getCodigo_id()).append("\n");
	    }

	    return cardapio.toString();
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

	@Override
    public void exibirDetalhes() {
        System.out.println("Detalhes do Cozinheiro: " + this.getNome() + ", CPF: " + this.getCPF());
    }
}

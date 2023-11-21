package entities;

import java.time.LocalDate;

import interfaces.Exibir;

/*
- Os garçons do restaurante também precisam ser cadastrados. É necessário
armazenar: nome, CPF, RG, estado civil, endereço completo, data de admissão no
restaurante, nro da carteira de trabalho, salário base e dia de folga na semana.
- Já os garçons recebem um salário fixo e ganham uma gratificação única para
todos os garçons se o nro de pedidos por mês excede um valor limite de pedidos.

 */

public class Garcom extends Funcionario implements Exibir{

	private Double salario_base = 2500.00;
	private String dia_de_folga;
	private static final int LIMITE_PEDIDOS = 30;
	
	public Garcom(String nome, String CPF, String RG, String estado_civil, String endereco, LocalDate data_admissao,
			String num_carteira_trabalho, String dia_de_folga) {
		super(nome, CPF, RG, estado_civil, endereco, data_admissao, num_carteira_trabalho);
		this.dia_de_folga = dia_de_folga;
	}

	public Double getSalario_base() {
		return salario_base;
	}

	public String getDia_de_folga() {
		return dia_de_folga;
	}

	public void setDia_de_folga(String dia_de_folga) {
		this.dia_de_folga = dia_de_folga;
	}

    public Double calcularSalario(double gratificacao, int numeroPedidosMensal) {
        // Verifica se o número de pedidos por mês excede o limite
        if (numeroPedidosMensal > LIMITE_PEDIDOS) {
            // Calcula o salário total somando o salário base e a gratificação
            return salario_base + gratificacao;
        } else {
            // Se o número de pedidos não exceder o limite, retorna apenas o salário base
            return salario_base;
        }
    }

	@Override
	public String toString() {
		return super.toString() + ", Salário base deste Garçom é: " + salario_base + ", dia de folga: " + dia_de_folga;
	}

	@Override
    public void exibirDetalhes() {
        System.out.println("Detalhes do Garçom: " + this.getNome() + ", CPF: " + this.getCPF());
    }
}

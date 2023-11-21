package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
nome, CPF, RG, estado civil, endereço completo, data de admissão no
restaurante, nro da carteira de trabalho
 */

public class Funcionario {

	private String nome;
	private String CPF;
	private String RG;
	private String estado_civil;
	private String endereco;
	private LocalDate data_admissao;
	private String num_carteira_trabalho;

	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Funcionario() {
        this.nome = "";
        this.CPF = "";
        this.RG = "";
        this.estado_civil = "";
        this.endereco = "";
        this.data_admissao = null; 
        this.num_carteira_trabalho = "";
	}
	
	public Funcionario(String nome, String CPF) {
		this.nome = nome;
		this.CPF = CPF;
	}

	public Funcionario(String nome, String CPF, String RG, String estado_civil, String endereco,
			LocalDate data_admissao, String num_carteira_trabalho) {
		this.nome = nome;
		this.CPF = CPF;
		this.RG = RG;
		this.estado_civil = estado_civil;
		this.endereco = endereco;
		this.data_admissao = data_admissao;
		this.num_carteira_trabalho = num_carteira_trabalho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public String getRG() {
		return RG;
	}

	public String getEstado_civil() {
		return estado_civil;
	}

	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public LocalDate getData_admissao() {
		return data_admissao;
	}

	public String getNum_carteira_trabalho() {
		return num_carteira_trabalho;
	}

	public Double calcularSalario() {
		return 0.0;
	}

	public boolean validarCPF(String cpf) {
		if (cpf.length() != 11) {
			return false;
		}

		int soma = 0;
		int peso = 10;
		for (int i = 0; i < 9; i++) {
			int digito = Character.getNumericValue(cpf.charAt(i));
			soma += digito * peso;
			peso--;
		}

		int resto = soma % 11;
		int primeiroDigitoVerificador = (resto < 2) ? 0 : (11 - resto);

		soma = 0;
		peso = 11;
		for (int i = 0; i < 10; i++) {
			int digito = Character.getNumericValue(cpf.charAt(i));
			soma += digito * peso;
			peso--;
		}

		resto = soma % 11;
		int segundoDigitoVerificador = (resto < 2) ? 0 : (11 - resto);

		return (primeiroDigitoVerificador == Character.getNumericValue(cpf.charAt(9)))
				&& (segundoDigitoVerificador == Character.getNumericValue(cpf.charAt(10)));
	}
	
	public void formatarCPF(String cpf) {
        if (cpf.length() == 11) {
            this.CPF = String.format("%s.%s.%s-%s", cpf.substring(0, 3), cpf.substring(3, 6), cpf.substring(6, 9), cpf.substring(9));
        } else {
            System.out.println("CPF inválido. O CPF deve ter 11 dígitos.");
        }
    }

	public String toString() {
		return "Nome deste Funcionário é: " + nome + ", CPF: " + CPF + ", RG: " + RG + ", estado civil: " + estado_civil
				+ ", endereço: " + endereco + ", data de admissão: " + data_admissao.format(fmt) + ", número da carteira de trabalho: "
				+ num_carteira_trabalho;
	}
}

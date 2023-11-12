package entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import enum_entites.Tipo_Pagamento;
import exception.DomainException;
import interfaces.Exibir;

/*
- Cada pedido que é realizado no restaurante deve ser registrado. Ele deve conter
um conjunto de itens associados ao pedido, bem como a quantidade de cada um.
O pedido deve ter uma data em que foi realizado, a hora de registro e a hora do
pagamento. O pedido também armazena o seu valor total, que é a soma dos itens
comprados, bem como a forma de pagamento realizada
- Para cada pedido é necessário armazenar também quem foi o garçom que fez o
atendimento, bem como o cozinheiro que preparou a comida.

 */

public class Pedido implements Exibir{
	
	private Item item;
	private Integer quantidade;
	private LocalDate data_pedido;
	private LocalTime hora_registro; 
	private LocalTime hora_pagamento;
	private Double valor_total; // soma dos itens comprados
	private Tipo_Pagamento forma_pagamento;
	private Garcom garcom;
	private Cozinheiro cozinheiro;
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	

	//Construtor Pedido
	public Pedido(Garcom garcom, Cozinheiro cozinheiro, LocalDate data_pedido, LocalTime hora_registro, LocalTime hora_pagamento, Tipo_Pagamento forma_pagamento){
		this.garcom = garcom;
		this.cozinheiro = cozinheiro;
		this.data_pedido = data_pedido;
		this.hora_registro = hora_registro;
		this.hora_pagamento = hora_pagamento;
		this.forma_pagamento = forma_pagamento;
	}

	//GETTERS AND SETTERS
	public Item getItem() {
		return item;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public LocalDate getData_pedido() {
		return data_pedido;
	}

	public LocalTime getHora_registro() {
		return hora_registro;
	}

	public LocalTime getHora_pagamento() {
		return hora_pagamento;
	}

	public Double getValor_total() {
		return valor_total;
	}

	public Tipo_Pagamento getForma_pagamento() {
		return forma_pagamento;
	}

	public void setForma_pagamento(Tipo_Pagamento forma_pagamento) {
		this.forma_pagamento = forma_pagamento;
	}

	public Garcom getGarcom() {
		return garcom;
	}

	public void setGarcom(Garcom garcom) {
		this.garcom = garcom;
	}

	public Cozinheiro getCozinheiro() {
		return cozinheiro;
	}

	public void setCozinheiro(Cozinheiro cozinheiro) {
		this.cozinheiro = cozinheiro;
	}
	
	public void verificaData(LocalDate data_pedido) {
        LocalDate hoje = LocalDate.now();

        if (data_pedido.isBefore(hoje)) {
            // Lança uma exceção se a data do pedido for anterior à data atual
            throw new DomainException("A data do pedido para atualização deve ser uma data futura ou a data atual!");
        }
    }
	
	public void adicionarItem(Item item) {
        this.item = item;

        if (this.valor_total == null) {
            this.valor_total = 0.0;  // Ou inicialize com algum valor padrão
        }
        // Atualize o valor_total com o valor do item multiplicado pela quantidade
        this.valor_total += item.getPreco_de_custo(); 
    }

	@Override
	public String toString() {
		return  "Garçom que realizou o atendimento: " + garcom.getNome() + ", Cozinheiro que preparou a comida: " + cozinheiro.getNome()
				+ ", data do pedido: " + data_pedido.format(fmt) + ", hora do registro: " + hora_registro + ", hora do pagamento: " + hora_pagamento
				+ ", forma de pagamento: " + forma_pagamento;
	}

	@Override
    public void exibirDetalhes() {
        System.out.println("Detalhes do Pedido");
    }
}

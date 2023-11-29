package application;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import entities.Bebida;
import entities.Cozinheiro;
import entities.Funcionario;
import entities.Garcom;
import entities.Ingrediente;
import entities.Item;
import entities.Pedido;
import entities.Prato_Principal;
import entities.Sobremesa;
import enum_entites.Categoria;
import enum_entites.Tipo_Embalagem;
import enum_entites.Tipo_Pagamento;
import exception.DomainException;
import java.io.*;
//import persistencia.arquivos;

public class Restaurante {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm");
			DateTimeFormatter fmt_2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

			Funcionario funcionario = new Funcionario();
			Garcom garcom = new Garcom(null, null, null, null, null, null, null, null);
			List<Garcom> garcons = new ArrayList<>();
			List<Cozinheiro> cozinheiros = new ArrayList<>();
			List<Item> list_item = new ArrayList<>();
			List<Item> itensEscolhidos = new ArrayList<>();
			List<Item> historicoItensEscolhidos = new ArrayList<>();
			Cozinheiro cozinheiro = new Cozinheiro(null, null, null, null, null, null, null, list_item);
			Pedido pedido = new Pedido(garcom, cozinheiro, null, null, null, null);

			String[] vetGarcons;
			String[] vetCozinheiros;
			String[] vetItens;
			String l, l2, l3;

			System.out.println("Deseja acessar os arquivos: ");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			l = sc.nextLine();
			if (l.equals("1")) {
				// Acesso ao arquivo de Garcons
				try {
					FileReader ent = new FileReader("arqGarcom.dat");
					BufferedReader rd = new BufferedReader(ent);
					while ((l = rd.readLine()) != null) {
						vetGarcons = l.split(":");
					}
					rd.close();
				} catch (IOException e1) {
					System.out.println("Erro ao acessar o arquivo");
				}
				// Acesso ao arquivo de Cozinheiros
				try {
					FileReader ent = new FileReader("arqCozinheiros.dat");
					BufferedReader rd = new BufferedReader(ent);
					while ((l2 = rd.readLine()) != null) {
						vetCozinheiros = l2.split(":");
					}
					rd.close();
				} catch (IOException e2) {
					System.out.println("Erro ao acessar o arquivo");
				}
				// Acesso ao arquivo de Itens
				try {
					FileReader ent = new FileReader("arqItens.dat");
					BufferedReader rd = new BufferedReader(ent);
					while ((l3 = rd.readLine()) != null) {
						vetItens = l3.split(":");
					}
					rd.close();
				} catch (IOException e3) {
					System.out.println("Erro ao acessar o arquivo");
				}
				System.out.println("Arquivo Acessado Sucesso!!");
			}

			System.out.println("BEM-VINDO AO BANCO DE DADOS DO RESTAURANTE GUSTEAUS´S!!!");
			System.out.println("Primeiramente, vamos ao cadastro dos Funcionários");

			boolean cadastrarGarcom = true;
			while (cadastrarGarcom) {
				System.out.print("Digite o nome do Garçom que irá anotar os pedidos: ");
				String nome = sc.nextLine();
				System.out.print(
						"Digite o CPF deste funcionário, digite o CPF no formato XXXXXXXXXXX (apenas números, sem pontos ou traços) -> (Exemplo: 12345678909): ");
				String CPF = sc.nextLine();
				funcionario.formatarCPF(CPF);

				if (!funcionario.validarCPF(CPF)) {
					System.out.println("CPF inválido. O programa será encerrado.");
					return; // Encerra o programa
				}

				System.out.print("Digite o dia de folga deste funcionário: ");
				String dia_de_folga = sc.nextLine();

				System.out.print("Digite o RG deste funcionário: ");
				String RG = sc.nextLine();
				System.out.print("Digite o estado civil: ");
				String estado_civil = sc.nextLine();
				System.out.print("Digite o endereço: ");
				String endereco = sc.nextLine();
				System.out.print("Digite a data de admissão (dd/MM/yyyy): ");
				LocalDate data_admissao = LocalDate.parse(sc.next(), fmt_2);
				System.out.print("Digite o número da carteira de trabalho: ");
				sc.nextLine();
				String num_carteira_trabalho = sc.nextLine();

				garcom = new Garcom(nome, funcionario.getCPF(), RG, estado_civil, endereco, data_admissao,
						num_carteira_trabalho, dia_de_folga);
				System.out.println();
				garcom.exibirDetalhes(); // método da interface
				System.out.println(garcom);
				garcons.add(garcom);

				System.out.print("Deseja cadastrar outro garçom? (s/n): ");
				String resposta = sc.next();

				sc.nextLine();
				if (resposta.equalsIgnoreCase("n")) {
					cadastrarGarcom = false;
				} else if (!resposta.equalsIgnoreCase("s")) {
					System.out.println("Resposta inválida. Encerrando o cadastro de garçons.");
					cadastrarGarcom = false;
				}
			}
			//Utilização do Random de Garcons
			garcom = new Garcom(garcom.getNome(), garcom.getCPF(), garcom.getRG(), garcom.getEstado_civil(),
					garcom.getEndereco(), garcom.getData_admissao(), garcom.getNum_carteira_trabalho(),
					garcom.getDia_de_folga());

			System.out.println();
			boolean continuarCadastro = true;
			System.out.println("Agora temos o cadastro dos itens deste restaurante!!!");
			while (continuarCadastro) {
				System.out.println("Escolha a categoria do item:");
				System.out.println("1. Prato Principal");
				System.out.println("2. Bebida");
				System.out.println("3. Sobremesa");
				System.out.println("4. Encerrar cadastro de itens");
				System.out.print("Sua escolha: ");
				int op = sc.nextInt();

				if (op == 4) {
					continuarCadastro = false;
					continue;
				}

				Categoria categoria = null;
				switch (op) {
				case 1:
					categoria = Categoria.PRATO_PRINCIPAL;
					break;
				case 2:
					categoria = Categoria.BEBIDA;
					break;
				case 3:
					categoria = Categoria.SOBREMESA;
					break;
				default:
					System.out.println("Escolha inválida.");
				}

				switch (categoria) {

				case PRATO_PRINCIPAL:
					System.out.println();
					System.out.println("Agora você vai descrever sobre o prato principal!");
					System.out.print("Digite o nome comercial do item: ");
					sc.nextLine();
					String nome_comercial = sc.nextLine();
					System.out.print("Digite o código identificador do item: ");
					String codigo_id = sc.nextLine();
					System.out.print("Digite o preço unitário do item: ");
					double preco_unitario = sc.nextDouble();
					System.out.print("Digite o preço de custo: ");
					double preco_de_custo = sc.nextDouble();

					System.out.println();
					System.out.println("Agora liste os ingredientes que possui neste prato principal:");
					System.out.print("Quantos ingredientes possui neste prato: ");
					int n = sc.nextInt();
					sc.nextLine();

					List<Ingrediente> ingredientes = new ArrayList<>();

					for (int i = 0; i < n; i++) {
						System.out.print("Digite o nome do ingrediente " + (i + 1) + ": ");
						String nome = sc.nextLine();
						Ingrediente ingre = new Ingrediente(nome);
						ingredientes.add(ingre);
					}

					System.out.print("Digite a descrição deste prato principal: ");
					String descricao = sc.nextLine();
					System.out.print("Digite o tempo de preparo deste prato (HH:mm): ");
					LocalTime tempo_preparo = LocalTime.parse(sc.next(), fmt);

					Prato_Principal prato_principal = new Prato_Principal(nome_comercial, codigo_id, preco_unitario,
							preco_de_custo,categoria, ingredientes, descricao, tempo_preparo);

					list_item.add(prato_principal);
					cozinheiro.adicionarItemAoCardapio(prato_principal);
					System.out.println();
					System.out.println(prato_principal);
					System.out.println();
					break;

				case BEBIDA:
					sc.nextLine();
					System.out.println();
					System.out.println("Agora você vai descrever sobre a bebida!");
					System.out.print("Digite o nome comercial do item: ");
					nome_comercial = sc.nextLine();
					System.out.print("Digite o código identificador do item: ");
					codigo_id = sc.nextLine();
					System.out.print("Digite o preço unitário do item: ");
					preco_unitario = sc.nextDouble();
					System.out.print("Digite o preço de custo: ");
					preco_de_custo = sc.nextDouble();
					String.format("%.2f", preco_de_custo);
					Bebida.setValor_pago_cozinheiro(preco_de_custo);
					System.out.print("Digite o tamanho da embalagem: ");
					double tamanho_embalagem = sc.nextDouble();

					System.out.println("Escolha o tipo de embalagem:");
					System.out.println("1. LATA");
					System.out.println("2. GARRAFA PLÁSTICA");
					System.out.println("3. GARRAFA DE VIDRO");
					System.out.println("4. OUTROS");
					System.out.print("Sua escolha: ");
					op = sc.nextInt();

					Tipo_Embalagem tipoEmbalagem = null;
					switch (op) {
					case 1:
						tipoEmbalagem = Tipo_Embalagem.LATA;
						break;
					case 2:
						tipoEmbalagem = Tipo_Embalagem.GARRAFA_PLASTICA;
						break;
					case 3:
						tipoEmbalagem = Tipo_Embalagem.GARRAFA_VIDRO;
						break;
					case 4:
						tipoEmbalagem = Tipo_Embalagem.OUTRO_TIPO;
						break;
					default:
						System.out.println("Escolha inválida para tipo de embalagem!");
					}

					Bebida bebida = new Bebida(nome_comercial, codigo_id, preco_unitario, preco_de_custo, categoria,
							tamanho_embalagem, tipoEmbalagem);

					System.out.println();
					bebida.exibirDetalhes(); // metodo da interface
					list_item.add(bebida);
					cozinheiro.adicionarItemAoCardapio(bebida);

					System.out.println(bebida);
					System.out.println();
					break;

				case SOBREMESA:
					sc.nextLine();
					System.out.println();
					System.out.println("Agora você vai descrever sobre a sobremesa!");
					System.out.print("Digite o nome comercial do item: ");
					nome_comercial = sc.nextLine();
					System.out.print("Digite o código identificador do item: ");
					codigo_id = sc.nextLine();
					System.out.print("Digite o preço unitário do item: ");
					preco_unitario = sc.nextDouble();
					System.out.print("Digite o preço de custo: ");
					preco_de_custo = sc.nextDouble();

					System.out.println();
					System.out.println("Agora liste os ingredientes que possui nesta sobremesa:");
					System.out.print("Quantos ingredientes possui nesta sobremesa: ");
					n = sc.nextInt();
					sc.nextLine();

					ingredientes = new ArrayList<>();

					for (int i = 0; i < n; i++) {
						System.out.print("Digite o nome do ingrediente " + (i + 1) + ": ");
						String nome = sc.nextLine();
						Ingrediente ingre = new Ingrediente(nome);
						ingredientes.add(ingre);
					}

					System.out.print("Digite a descrição desta sobremesa: ");
					descricao = sc.nextLine();
					System.out.print("Digite o tempo de preparo desta sobremesa (HH:mm): ");
					tempo_preparo = LocalTime.parse(sc.next(), fmt);
					System.out.print("Digite o número de caloria da sobremesa: ");
					Double num_caloria = sc.nextDouble();

					Sobremesa sobremesa = new Sobremesa(nome_comercial, codigo_id, preco_unitario, preco_de_custo,
							categoria, ingredientes, descricao, tempo_preparo, num_caloria);

					sobremesa.exibirDetalhes(); // método da interface
					list_item.add(sobremesa);
					cozinheiro.adicionarItemAoCardapio(sobremesa);
					System.out.println();
					System.out.println(sobremesa);
					System.out.println();
					break;
				}
			}
			System.out.println();
			sc.nextLine();
			System.out.println("Agora temos o cadastro do(a) Cozinheiro(a) que fará os itens do pedido!!!");

			boolean cadastrarCozinheiro = true;
			while (cadastrarCozinheiro) {
				System.out.print("Digite o nome do(a) Cozinheiro(a) que irá preprar os pratos: ");
				String nome = sc.nextLine();
				System.out.print(
						"Digite o CPF deste funcionário, digite o CPF no formato XXXXXXXXXXX (apenas números, sem pontos ou traços) -> (Exemplo: 12345678909): ");
				String CPF = sc.nextLine();

				if (!funcionario.validarCPF(CPF)) {
					System.out.println("CPF inválido. O programa será encerrado.");
					return; // Encerra o programa
				}

				System.out.print("Digite o RG deste funcionário: ");
				String RG = sc.nextLine();
				System.out.print("Digite o estado civil: ");
				String estado_civil = sc.nextLine();
				System.out.print("Digite o endereço: ");
				String endereco = sc.nextLine();
				System.out.print("Digite a data de admissão (dd/MM/yyyy): ");
				LocalDate data_admissao = LocalDate.parse(sc.next(), fmt_2);
				System.out.print("Digite o número da carteira de trabalho: ");
				sc.nextLine();
				String num_carteira_trabalho = sc.nextLine();

				cozinheiro = new Cozinheiro(nome, funcionario.getCPF(), RG, estado_civil, endereco, data_admissao,
						num_carteira_trabalho, list_item);
				System.out.println();
				System.out.println(cozinheiro);
				cozinheiros.add(cozinheiro);

				cozinheiro.exibirDetalhes(); // método da interface

				System.out.print("Deseja cadastrar outro cozinheiro? (s/n): ");
				String resposta = sc.next();

				sc.nextLine();
				if (resposta.equalsIgnoreCase("n")) {
					cadastrarCozinheiro = false;
				} else if (!resposta.equalsIgnoreCase("s")) {
					System.out.println("Resposta inválida. Encerrando o cadastro de cozinheiros.");
					cadastrarCozinheiro = false;
				}
			}

			//Uso do Random de Cozinheiros
			cozinheiro = new Cozinheiro(cozinheiro.getNome(), cozinheiro.getCPF(), cozinheiro.getRG(),
					cozinheiro.getEstado_civil(), cozinheiro.getEndereco(), cozinheiro.getData_admissao(),
					cozinheiro.getNum_carteira_trabalho(), list_item);

			System.out.println("Funcinoarios cadastrados no sistema: ");
			System.out.println();
			System.out.println("Garçons cadastrados: ");
			for (Garcom g : garcons) {
				System.out.println(g);
			}

			System.out.println();
			System.out.println("Cozinheiros(as) cadastrados: ");
			for (Cozinheiro c : cozinheiros) {
				System.out.println(c);
			}

			System.out.println();

			System.out.println();
			System.out.println("DADOS CADASTRADOS CORRETAMENTE!!!");
			System.out.println();
			System.out.println("BEM-VINDO AO RESTAURANTE GUSTEAUS´S!!!");
			System.out.println();

			boolean continuarPedidos = true;
			int total_pedidos = 0;

			try {
				while (continuarPedidos) {

					boolean escolhendoItens = true;

					// Escolher aleatoriamente um garçom
					Random random = new Random();
					Garcom garcomAleatorio = garcons.get(random.nextInt(garcons.size()));

					// Escolher aleatoriamente um cozinheiro
					Cozinheiro cozinheiroAleatorio = cozinheiros.get(random.nextInt(cozinheiros.size()));

					// Exibir o nome dos funcionários escolhidos aleatoriamente
					System.out.println("Garçom que irá te atender hoje é: " + garcomAleatorio.getNome());
					System.out
							.println("Cozinheiro(a) que irá fazer os seus pratos é: " + cozinheiroAleatorio.getNome());

					while (escolhendoItens) {
						System.out.print(cozinheiro.MostrarCardapio(list_item));
						System.out.print("Escolha um item do cardápio digitando o código identificador: ");
						String codigoEscolhido = sc.next();

						// Encontrar o item escolhido no cardápio
						Item itemEscolhido = null;
						for (Item item : list_item) {
							if (item.getCodigo_id().equals(codigoEscolhido)) {
								itemEscolhido = item;
								break;
							}
						}

						// Verificar se o item foi encontrado e adicioná-lo à lista de itens escolhidos
						if (itemEscolhido != null) {
							pedido.adicionarItem(itemEscolhido); // Certifique-se de ter a quantidade disponível
							itensEscolhidos.add(itemEscolhido);
							System.out.println("Você escolheu: " + itemEscolhido.getNome_comercial());
							System.out.println("Valor total do pedido: " + pedido.getValor_total());
						} else {
							System.out.println("Item não encontrado no cardápio!");
						}

						System.out.print("Algo mais (s/n)? ");
						String resposta = sc.next();

						if (resposta.equalsIgnoreCase("n")) {
							escolhendoItens = false;
						} else if (!resposta.equalsIgnoreCase("s")) {
							System.out.println("Resposta inválida. Encerrando o cadastro de pedidos.");
							escolhendoItens = false;
						}

						// Exibir a lista de itens escolhidos
						System.out.println("\nItens escolhidos:");
						for (Item item : itensEscolhidos) {
							System.out.println(item.getNome_comercial());
						}
					}

					System.out.println();
					System.out.print(
							"Informe uma data para a realização do pedido (dd/MM/yyyy), desde que seja uma data futura ou atual: ");
					LocalDate data_pedido = LocalDate.parse(sc.next(), fmt_2);
					pedido.verificaData(data_pedido); //Verifica a data do pedido (atual ou futura)
					System.out.print("Digite a hora de registro (HH:mm): ");
					LocalTime hora_registro = LocalTime.parse(sc.next(), fmt);
					System.out.print("Digite a hora que o pagamento foi realizado (HH:mm): ");
					LocalTime hora_pagamento = LocalTime.parse(sc.next(), fmt);
					System.out.println("Escolha a forma de pagamento:");
					System.out.println("1. DÉBITO");
					System.out.println("2. CRÉDITO");
					System.out.println("3. DINHEIRO");
					System.out.println("4. OUTROS");
					System.out.print("Sua escolha: ");
					int op = sc.nextInt();

					Tipo_Pagamento tipoPagamento = null;
					switch (op) {
					case 1:
						tipoPagamento = Tipo_Pagamento.DEBITO;
						break;
					case 2:
						tipoPagamento = Tipo_Pagamento.CREDITO;
						break;
					case 3:
						tipoPagamento = Tipo_Pagamento.DINHEIRO;
						break;
					case 4:
						tipoPagamento = Tipo_Pagamento.OUTRO_TIPO;
						break;
					default:
						System.out.println("Escolha inválida para tipo de pagamento!");
					}

					pedido = new Pedido(garcomAleatorio, cozinheiroAleatorio, data_pedido, hora_registro,
							hora_pagamento, tipoPagamento);

					pedido.exibirDetalhes(); // método da interface
					System.out.println(pedido);
					System.out.print("Deseja cadastrar outro pedido? (s/n): ");
					String resposta = sc.next();

					if (resposta.equalsIgnoreCase("n")) {
						continuarPedidos = false;
					} else if (!resposta.equalsIgnoreCase("s")) {
						System.out.println("Resposta inválida. Encerrando o cadastro de pedidos.");
						continuarPedidos = false;
					}
					total_pedidos++;
					pedido.setQuantidade(total_pedidos);
					historicoItensEscolhidos.addAll(itensEscolhidos); // Adiciona os itens escolhidos ao histórico

					itensEscolhidos.clear();
				}

				double gratificacao = 0.0;
				if (pedido.getQuantidade() > 30) {
					System.out.println("A quantidade de pedidos excedeu o limite!!!");
					System.out.print("Devido a isso informe a gratificação para os Garçons: ");
					gratificacao = sc.nextDouble();
				} else {
					gratificacao = 0.0;
				}
				System.out.println("OBRIGADO POR ESCOLHER NOSSO RESTAURANTE!!!");

				System.out.println();
				System.out.println("FIM DO EXPEDIENTE!!!");
				System.out.println();

				for (Garcom garcom_1 : garcons) {
					System.out.println("Garçom: " + garcom_1.getNome() + ": R$"
							+ String.format("%.2f", garcom_1.calcularSalario(gratificacao, pedido.getQuantidade())));
				}

				for (Cozinheiro cozinheiro_2 : cozinheiros) {
					System.out.println("Cozinheiro(a): " + cozinheiro_2.getNome() + ": R$"
							+ String.format("%.2f", cozinheiro_2.calcularSalario(historicoItensEscolhidos)));
				}

			} catch (DomainException e) {
				System.out.println(e.getMessage());

			} catch (InputMismatchException e) {
				System.out.println("Erro de entrada: O tipo de entrada fornecido é inválido.");
				System.out.println("Certifique-se de inserir o tipo de dado correto e tente novamente.");
			}

			/*
			 * List<Garcom> garcons = new ArrayList<>(); List<Cozinheiro> cozinheiros = new
			 * ArrayList<>(); List<Item> list_item = new ArrayList<>(); List<Item>
			 * itensEscolhidos = new ArrayList<>(); List<Item> historicoItensEscolhidos =
			 * new ArrayList<>();
			 */
			try {
				FileWriter arq = new FileWriter("arqGarcom.dat");
				PrintWriter out = new PrintWriter(arq);
				// Usando um loop for para percorrer o ArrayList e acessar cada objeto
				for (int i = 0; i < garcons.size(); i++) {
					Garcom elem1 = garcons.get(i);
					out.println(elem1);

				}
				out.close();
			} catch (IOException erro) {
				System.out.println(" Erro na escrita dos dados Gracons ");
			}
			try {
				FileWriter arq = new FileWriter("arqCozinheiros.dat");
				PrintWriter out = new PrintWriter(arq);
				for (int i = 0; i < cozinheiros.size(); i++) {
					Cozinheiro elem2 = cozinheiros.get(i);
					out.println(elem2);
				}
				out.close();
			} catch (IOException erro) {
				System.out.println(" Erro na escrita dos dados Cozinheiros ");
			}
			try {
				FileWriter arq = new FileWriter("arqItens.dat");
				PrintWriter out = new PrintWriter(arq);
				for (int i = 0; i < historicoItensEscolhidos.size(); i++) {
					Item elem3 = historicoItensEscolhidos.get(i);
					out.println(elem3);
				}
				out.close();
			} catch (IOException erro) {
				System.out.println(" Erro na escrita dos dados Itens ");
			}

			sc.close();
		}
	}
}

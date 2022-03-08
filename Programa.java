

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		try {
			PessoaFisica pj = PessoaMock.getPessoaJuridica();
			PessoaFisica pf = PessoaMock.getPessoaFisica();

			Scanner sc = new Scanner(System.in);
			int opcao, agencia, conta, senha;
			double valorDeposito = 0, valorSaque = 0;

			System.out.println(".......... BEM VINDO AO NOSSO BANCO! .......... ");
			System.out.println("\n\nEscolha o tipo de ocupa��o: ");
			System.out.println("1. Pessoa Fisica");
			System.out.println("2. Pessoa Juridica");
			System.out.println("3. Mais informacoes");
			System.out.print("\nOpcaoo: ");
			opcao = sc.nextInt();

			switch (opcao) {
			// MENU PF
			case 1:

				System.out.print("\nInsira sua agencia: ");
				agencia = sc.nextInt();

				System.out.print("Insira sua conta: ");
				conta = sc.nextInt();

				System.out.print("Insira sua senha: ");
				senha = sc.nextInt();

				if (pf.verificarConta(agencia, conta, senha) == true) {

					do {
						System.out.println("\n\n        BEM VINDO !!!\n\n" + pf.getNome() + "\n" + pf.getDocumento());
						System.out.println("\n.......... MENU ........... ");
						System.out.println("1- Verificar Saldo");
						System.out.println("2- Deposito");
						System.out.println("3- Saque");
						System.out.println("4- Mostrar dados");
						System.out.println("5- Sair");
						System.out.print("Escolha uma operacaoo : ");
						opcao = sc.nextInt();

						switch (opcao) {
						case 1:
							System.out.println("Saldo atual: " + pf.getSaldo());

							break;

						case 2:
							System.out.print("Digite a quantia para deposito: ");
							valorDeposito = sc.nextDouble();

							pf.realizarDeposito(valorDeposito);
							System.out.println("\n");
							break;

						case 3:
							System.out.print("Digite a quantia para saque: ");
							valorSaque = sc.nextDouble();

							pf.sacarDinheiro(valorSaque);
							System.out.println("\n");
							break;

						case 4:
							System.out.println(pf.mostrarDados());
							break;

						case 5:
							System.out.println("Sess�o Finalizada. Fenchando o aplicativo...\n");
							System.exit(0);
							break;

						}

					} while (opcao != 4);

				}
				break;

			// MENU PJ
			case 2:

				System.out.print("\nInsira sua ag�ncia: ");
				agencia = sc.nextInt();

				System.out.print("Insira sua conta: ");
				conta = sc.nextInt();

				System.out.print("Insira sua senha: ");
				senha = sc.nextInt();

				if (pj.verificarConta(agencia, conta, senha) == true) {

					do {
						System.out.println("\n\n        BEM VINDO !!!\n\n" + pj.getNome() + "\n" + pj.getDocumento());
						System.out.println("\n.......... MENU ........... ");
						System.out.println("1- Verificar Saldo");
						System.out.println("2- Dep�sito");
						System.out.println("3- Saque");
						System.out.println("4- Pagar salario");
						System.out.println("5- Mostrar dados");
						System.out.println("6- Sair");

						opcao = sc.nextInt();

						switch (opcao) {
						case 1:
							System.out.println("Saldo atual: " + pj.getSaldo());
							System.out.println("\n");
							break;

						case 2:
							System.out.print("Digite a quantia para deposito: ");
							valorDeposito = sc.nextDouble();

							pf.realizarDeposito(valorDeposito);
							System.out.println("\n");
							break;

						case 3:
							System.out.print("Digite a quantia para saque: ");
							valorSaque = sc.nextDouble();

							pj.sacarDinheiro(valorSaque);
							System.out.println("\n");
							break;

						case 4:
							pj.realizarDeposito(pj.sacarDinheiro(5000));
							System.out.println("Transferido R$5.000,00 para " + pf.getNome());
							break;
						case 5:
							System.out.println(pj.mostrarDados());
							break;
						case 6:
							System.out.println("Sess�o Finalizada. Fenchando o aplicativo...\n");
							System.exit(0);
							break;
						}

					} while (opcao != 4);

				}
				break;

			// MAIS INFORMACOES

			case 3:

				System.out.println("\nSobre\n-----------------------------");

				System.out.println("\n\nComo utilizar o banco ?\n-----------------------------");
				System.out.println(
						"1. Na tela de boas-vindas, onde h� o primeiro menu, insira '1' caso seja um \ncliente Pessoa F�sica, baseado apenas em CPF e '2' caso seja um cliente \nPessoa Jur�dica, baseado em CPF e CNPJ. Para mais informa��es, \ndocumenta��o, tutorial e contato com desenvolvedores, insira '3'.");
				System.out.println(
						"\n2. Ap�s informar o tipo de cliente, efetue o login com suas devidas \ncredenciais (n�mero de ag�ncia, conta e senha). Se as informa��es forem \ncorretas e representarem um usu�rio cadastrado no sistema, o login ser� \nefetuado com sucesso. Caso contr�rio, o programa informa que h� \ninforma��es de acesso erradas e encerra.");
				System.out.println(
						"\n3. Ap�s a identifica��o do usu�rio, o segundo menu � mostrado. Insira '1' \npara verificar saldo; '2' para realizar um \ndep�sito; '3' para realizar um saque, '4' para acessar o menu de servi�os e '5' para sair.");


				break;

			default:
				System.out.println("Opera��o inv�lida.");
			}

		} catch (Exception e) {
			System.out.println("ERRO - Sistema ser� fechado.");
			System.out.println("ERRO"+e);
		}

	}
}

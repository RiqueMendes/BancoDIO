

import java.util.Arrays;

public class PessoaFisica {
	
	// Atributos com encapsulamento
    protected String nome;
    protected String email;
    protected String documento;
    protected int agencia;
    protected int conta;
    protected int senhaCartao;
    protected double saldo;
    protected String[] telefonesDeContato;

    // verifica dados conta para login
 	public boolean verificarConta(int x, int y, int z) {

 		if (x != agencia || y != conta || z != senhaCartao) {
 			System.out.println("\nAcesso negado.\n");
 			return false;

 		} else
 			return true;
 	}
 	
 	// realiza deposito na conta
 	public void realizarDeposito (double deposito) {
 		this.saldo = saldo + deposito;
 	
 	}
 	
 	// saca dinheiro da conta
 	public double sacarDinheiro (double sacar) {
 		this.saldo = saldo - sacar;
 		return sacar;
 	}
 	
    // getters
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getDocumento() {
        return documento;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public int getSenhaCartao() {
        return senhaCartao;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public String[] getTelefonesDeContato() {
		return telefonesDeContato;
	}
    //

	// setters
	public void setTelefonesDeContato(String[] telefonesDeContato) {
		this.telefonesDeContato = telefonesDeContato;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public void setConta(int conta) {
		this.conta = conta;
	}


	public void setSenhaCartao(int senhaCartao) {
		this.senhaCartao = senhaCartao;
	}
	
	public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
	//
	
	public String mostrarDados() {
		return "PessoaFisica [nome=" + nome + ", email=" + email + ", cpf =" + documento + ", agencia=" + agencia
				+ ", conta=" + conta  + ", saldo=" + saldo + ", telefonesDeContato="
				+ Arrays.toString(telefonesDeContato) + "]";
	}
}

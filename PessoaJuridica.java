

import java.util.Arrays;

public class PessoaJuridica extends PessoaFisica {
	
	// polimorfismo sobrescrita para mostrar dados diferentes do pj
	@Override
	public String mostrarDados() {
		return "PessoaJuridica [nome=" + nome + ", email=" + email + ", cnpj =" + documento + ", agencia=" + agencia
				+ ", conta=" + conta + ", Valor em conta=" + saldo + ", Contato empresarial ="
				+ Arrays.toString(telefonesDeContato) + "]";
	}
}


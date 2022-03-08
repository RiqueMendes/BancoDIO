

public class PessoaMock {
	
	// funcao para definir os dados da pessoa fisica
	public static PessoaFisica getPessoaFisica() {
		
		PessoaFisica p = new PessoaFisica();
		p.setNome("Alfredo"); 
		p.setEmail("Alfredo@email.com");
		p.setDocumento("xxx.xxx.xxx-00");
		p.setAgencia(1);
		p.setConta (1);
		p.setSenhaCartao(3);
		p.setSaldo(5000.5); 
		
		
		String[] telefonesDeContato= new String[2];
	    telefonesDeContato[0] = "92xx-xxxx";
	    telefonesDeContato[1] = "98xx-xxxx";
	    p.setTelefonesDeContato(telefonesDeContato);
	    return p;
	}
	
	// funcao para definir os dados da pessoa juridica
	public static PessoaJuridica getPessoaJuridica() {
		
		PessoaJuridica a = new PessoaJuridica();
		a.setNome("Tropinha S.A."); 
		a.setEmail("Hello@Tropinha.com");
		a.setDocumento("XX. XXX. XXX - 0001-XX");
		a.setAgencia(1);
		a.setConta (1);
		a.setSenhaCartao(3);
		a.setSaldo (95000.5);
		
		
		String[] telefonesDeContato= new String[2];
	    telefonesDeContato[0] = "96xx-xxxx";
	    telefonesDeContato[1] = "91xx-xxxx";
	    a.setTelefonesDeContato(telefonesDeContato);
	    return a;
	}

}


public class ClasseDebugger {

	public static void main(String[] args) {
		PessoaJuridica pj = new PessoaJuridica(); 
		pj.setCpnj("11105469");
		pj.setNome("italo");
		pj.setSobrenome("gouveia");
		
		PessoaFisica pf = new PessoaFisica();
		pf.getEndereco().setCidade("jo�o pessoa");
		pf.getEndereco().setNumero("1501");
		pf.getEndereco().setBairro("Bessa");
		pf.getEndereco().setRua("Av. Campos Salles");
		pf.getEndereco().setCep("546879");
		pf.setCpf("11897835");
		pf.setNome("jo�o");
		pf.setSobrenome("marcos");
	}
}


public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fornecedor f = new Fornecedor();
		f.setNome("Italo");
		f.setEndereco("Bessa");
		f.setTelefone("83999293323");
		f.setValorCredito(1200f);
		f.setValorDebito(600f);
		f.obterSaldo();
		
		Empregado e = new Empregado();
		e.setNome("João");
		e.setEndereco("Mangabeira");
		e.setTelefone("83593565565");
		e.setSalarioBase(1000f);
		e.setCodSetor(5);
		e.setImposto(20);
		e.calcularSalario();
		
		Administrador a = new Administrador();
		a.setNome("Thiago");
		a.setEndereco("Cabo Branco");
		a.setTelefone("89568568");
		a.setCodSetor(2);
		a.setSalarioBase(1000f);
		a.setImposto(20);
		a.setAjudaCustos(100);
		a.calcularSalario();
		
		Operario o = new Operario();
		o.setNome("Maria");
		o.setEndereco("Cristo");
		o.setTelefone("88446843");
		o.setCodSetor(4);
		o.setSalarioBase(1000f);
		o.setImposto(10);
		o.setValorProducao(100f);
		o.setComissao(10);
		o.calcularSalario();
		
		Vendedor v = new Vendedor();
		v.setNome("Rodolfo");
		v.setEndereco("Manaira");
		v.setTelefone("45468797");
		v.setCodSetor(3);
		v.setSalarioBase(1000f);
		v.setImposto(10);
		v.setValorVendas(100f);
		v.setComissao(10);
		v.calcularSalario();
		
	}

}

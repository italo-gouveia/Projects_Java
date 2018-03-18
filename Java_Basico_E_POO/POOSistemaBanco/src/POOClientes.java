
public class POOClientes {
	public static void main(String[]args){
		Clientes cliente1 = new Clientes();
			cliente1.nome = "João";
			cliente1.código = 001;
			cliente1.endereço = "Avenida Luiz Benedito";
			cliente1.idade = 40;
			cliente1.status();
		Clientes cliente2 = new Clientes();
			cliente2.nome = "Maria";
			cliente2.código = 002;
			cliente2.endereço = "Rua João Inácio";
			cliente2.idade = 59;
			cliente2.status();
	}
}

import java.util.Scanner;

public class Agenda {

	Scanner inString = new Scanner(System.in);
	
	private Contato[] contatos;

	
	public Agenda(){
		this.contatos = new Contato[5];
		for(int i=0; i<contatos.length; i++){
			this.contatos[i] = new Contato();
		}
	}
	
	public Agenda(Contato[] contatos) {
		super();
		this.contatos = contatos;
	}
	
	public Contato[] getContatos() {
		return contatos;
	}
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	
	public void adicionarContato(){
		this.contatos[i] = new Contato();
		System.out.println("Digite o nome: ");
		this.contatos[i].setNome(inString.nextLine());
		System.out.println("Digite o email: ");
		this.contatos[i].setEmail(inString.nextLine());
		this.contatos[i++];
	}
	public void pesquisarContato(){
		
	}
	public void excluirContato(){
		
	}

}

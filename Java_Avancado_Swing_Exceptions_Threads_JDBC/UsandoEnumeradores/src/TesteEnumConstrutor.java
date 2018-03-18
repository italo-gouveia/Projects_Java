
public class TesteEnumConstrutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DiaSemana dia = DiaSemana.DOMINGO;
		
		System.out.println(dia.toString() + " - " + dia.getValor());
	}

}

//Enums estendem a classe java.lang.Enum
/*Podem ser comparadas usando == (diferente de classes que utiliza 
o equals por estar apontando para um endereço da memória, ou seja, não é um valor)*/
//Não podem ser instanciadas com new
//Podem implementar interfaces
//Pode ser declarado separadamente ou dentro de uma classe

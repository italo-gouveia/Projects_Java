
public class ValuesEValueOF {

	public static void main(String[] args) {
		//abaixo, duas formas de utilizar o método values para mostrar os valores
		
		
		DiaSemana[] dias = DiaSemana.values();
		
		for(int i=0; i<dias.length; i++){
			System.out.println(dias[i]);
		}
		
		for(DiaSemana dia : DiaSemana.values()){
			System.out.println(dia);
		}
		
		//utilizando valueOf - retorna o valor de um enum em uma string
		//A sintáxe é: System.out.println(Enum.valueOf(enumType, name));
		
		//Primeira Forma
		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
		
		//Segunda Forma
		DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");
		System.out.println(dia);
	}
}

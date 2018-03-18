
public class Avaliador {
	
	private float maior;	

	public Avaliador(){
		
	}
	
	public float avaliar(Leilao l){
		for(int i = 0; i < l.getLances().length; i++){
			if(l.getLances()[i] != null){
				if(l.getLances()[i].getValor() > maior){
					maior = l.getLances()[i].getValor();
				}
			}
		}
		return maior;
	}

}

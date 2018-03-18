import java.util.Random;
import java.util.UUID;

public class MainClass {

/*	public boolean getRandomBoolean() {
	    Random random = new Random();
	    return random.nextBoolean();
	}
*/	
	public static void main(String[] args) {
		
		ClientDAO cDao = new ClientDAO();
		
/*		UUID uuidName = UUID.randomUUID();
		String myRandomName = uuidName.toString();
		
		UUID uuidCpf_cnpj = UUID.randomUUID();
		String myRandomCpf_cnpj = uuidCpf_cnpj.toString();
		
	    Random randomBoolean = new Random();
	    Random randomFloat = new Random();
	    
	    
		for(int i = 0; i < 100; i++) {
			Client client = new Client(myRandomCpf_cnpj.substring(0, 20), myRandomName, randomBoolean.nextBoolean(), randomFloat.nextFloat());
			cDao.insert(client);
		}*/
		cDao.insert(new Client("118978", "Italo", true, 580.0f));
		cDao.insert(new Client("119745", "Wesley", true, 400.0f));
		cDao.insert(new Client("548697", "Laercio", true, 1000.0f));
		cDao.insert(new Client("654132", "Kleitofi", true, 1400.0f));
		cDao.insert(new Client("124654", "Kevin", true, 1300.0f));
		cDao.consult();
		
		
	}

}

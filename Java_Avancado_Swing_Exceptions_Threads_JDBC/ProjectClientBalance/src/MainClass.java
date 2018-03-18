
public class MainClass {

	
	public static void main(String[] args) {
		
		ClientDAO cDao = new ClientDAO();
		
		cDao.insert(new Client("118978", "Italo", true, 580.0f));
		cDao.insert(new Client("119745", "Wesley", true, 400.0f));
		cDao.insert(new Client("548697", "Laercio", true, 1000.0f));
		cDao.insert(new Client("654132", "Rubens", true, 1400.0f));
		cDao.insert(new Client("124654", "Kevin", true, 1300.0f));
		cDao.consult();
		
		
	}

}

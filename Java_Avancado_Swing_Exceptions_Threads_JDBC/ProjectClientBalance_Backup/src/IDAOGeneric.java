import java.util.ArrayList;

public interface IDAOGeneric <T>{
	public void insert(T o);
	public ArrayList<T> consult();
}

import java.util.ArrayList;

public interface IDAOGeneric <T>{
	public void inserir(T o);
	public ArrayList<T> listar();
	public void deletar(long id);
	public void atualizar(long id, Ingresso i);
}

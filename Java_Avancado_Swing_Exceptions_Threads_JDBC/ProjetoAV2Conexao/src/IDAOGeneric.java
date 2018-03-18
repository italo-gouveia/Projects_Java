import java.util.ArrayList;

public interface IDAOGeneric <T>{
	public void inserir(T o);
	public ArrayList<T> listar();
	public void deletar(long chassi);
	public void atualizar(long chassi, Carro c);
}

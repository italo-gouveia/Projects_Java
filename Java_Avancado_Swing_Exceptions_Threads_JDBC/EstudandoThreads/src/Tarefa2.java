import javax.swing.JOptionPane;

public class Tarefa2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inicio do JOptionPane");
		for(int i=0; i< 20; i++) {
			JOptionPane.showMessageDialog(null, "ok");
		}
		System.out.println("Fim do JOptionPane");
	}

	
}

import java.io.FileNotFoundException;

public class ExceptionChecked {
		public static void main(String[] args) throws FileNotFoundException {
		new java.io.FileInputStream("arquivo.txt");
		}
}

/* esse exception diferente dos anteriores que são unchecked 
 * é do tipo checked, ou seja, precisa ser tratada, nesse caso 
 * pode-se trata-la por um try-catch ou da forma implementa 
 * nesta classe*/
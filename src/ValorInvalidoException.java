
public class ValorInvalidoException extends RuntimeException {
	public ValorInvalidoException(double valor){
		super("Valor Inválido: " + valor);
	}
}

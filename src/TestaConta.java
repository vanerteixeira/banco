
public class TestaConta {
	public static void main(String[] args) {
		System.out.println("Olá Mundo");
		Conta conta = new Conta();
		
		conta.setLimite(1000.0);
		
		conta.saca(100.0);
	}
}

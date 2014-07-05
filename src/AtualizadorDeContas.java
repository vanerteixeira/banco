
public class AtualizadorDeContas {
	private double selic;
	
	public AtualizadorDeContas(double selic){
		this.selic = selic;
	}
	
	public void roda(Conta c){
		System.out.println(c.getSaldo());
		c.atualiza(this.selic);
		c.getSaldo();
		System.out.println(c.getSaldo());
	}
}

public class Conta {
	protected double saldo;
	private String titular;
	private double limite;
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public void saca(double valor) {
		this.saldo -= valor;
		
	}
	public void deposita(double valor) {
		if (valor < 0){
			throw new ValorInvalidoException(valor);
		}else{
			this.saldo += valor;
		}
	}
	public void atualiza(double selic) {
		
	}
	
	
}


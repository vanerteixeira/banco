
public class TestaDeposita {
	public static void main(String[] args) {
		Conta cp = new ContaPoupanca();
		try {
		cp.deposita(-100.0);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
}
}



public class TestaTributavel {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());
		
		Tributavel t = (Tributavel) cc;
		System.out.println(t.calculaTributos());
		
		SeguroDeVida sv = new SeguroDeVida();
		System.out.println(sv.calculaTributos());
		
	}
}

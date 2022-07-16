
public class Main {

	public static void main(String[] args) {
		Cliente daniela = new Cliente();
		daniela.setNome("daniela");
		
		
		Conta cc = new ContaCorrente(daniela);
		Conta poupanca = new ContaPoupanca(daniela);
				
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
    }

}

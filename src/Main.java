
public class Main {

	public static void main(String[] args) {
		Cliente patrick = new Cliente();
		patrick.setNome("Patrick");
		
		Conta cc = new ContaCorrente(patrick);
		Conta poupanca = new ContaPoupanca(patrick);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}

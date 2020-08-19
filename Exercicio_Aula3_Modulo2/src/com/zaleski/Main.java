package com.zaleski;

public class Main {
	public static void main(String[] args) {
		
		Cliente cliente01 = new Cliente(01, "Thiago", "Zaleski", "99.999.999-9", "999.999.999-99");
		System.out.println(cliente01);
		ContaCorrente cc1 = new ContaCorrente(100.00, cliente01, 200.00);
		System.out.println("Conta corrente");

		cc1.depositar(30.00);
		cc1.depositarCheque(90.00, "Nubank", "10/08/2020");
		cc1.sacar(250.00);
		cc1.sacar(60.00);
		cc1.depositar(60.00);
		cc1.sacar(300.00);

		System.out.println("Conta poupança");
		
		ContaPoupanca cp1 = new ContaPoupanca(cliente01, 100.0, 0.02);
		cp1.recolherJuros();
		cp1.depositar(20.0);
		cp1.sacar(30.0);
		cp1.sacar(100.00);



	}

}

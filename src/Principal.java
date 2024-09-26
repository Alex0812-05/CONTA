public class Principal {
	public static void main(String[] args) {
        // Criar uma nova conta bancária com saldo inicial
        ContaBancaria conta = new ContaBancaria(1000.00);

        // Realizar depósitos
        conta.depositar(200.00);
        conta.depositar(150.00);

        // Consultar saldo
        conta.consultarSaldo();

        // Realizar saques
        conta.sacar(100.00);
        conta.sacar(50.00);

        // Consultar saldo novamente
        conta.consultarSaldo();

}
}

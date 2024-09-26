public class ContaBancaria {
	   double saldo; 
	   int consultas; 

	    //Atributos da ContaBancaria
	    public ContaBancaria(double saldoInicial) {
	        if (saldoInicial >= 0) {
	            this.saldo = saldoInicial;
	        } else {
	            System.out.println("O saldo inicial não pode ser negativo.");
	            this.saldo = 0;
	        }
	        this.consultas = 0;
	    }

	    //Atributos para saber o valor da taxa
	    public void depositar(double valor) {
	        if (valor > 0) {
	            double taxa = valor * 0.01; 
	            saldo += valor - taxa;
	            System.out.println("Depósito realizado: R$" + valor + " (Taxa: R$" + taxa + ")");
	        } else {
	            System.out.println("Valor de depósito deve ser maior que zero.");
	        }
	    }

	    //Atributos para poder ver o saldo e o saque
	    public void sacar(double valor) {
	        if (valor > 0) {
	            double taxa = valor * 0.005; 
	            if (saldo >= (valor + taxa)) {
	                saldo -= (valor + taxa);
	                System.out.println("Saque realizado: R$" + valor + " (Taxa: R$" + taxa + ")");
	            } else {
	                System.out.println("Saldo insuficiente para saque.");
	            }
	        } else {
	            System.out.println("Valor de saque deve ser maior que zero.");
	        }
	    }

	   //Atributo para acessar o saldo
	    public double consultarSaldo() {
	        consultas++;
	        if (consultas % 5 == 0) {
	            saldo -= 0.10; // 
	            System.out.println("Cobrança de R$0.10 pela consulta.");
	        }
	        System.out.println("Saldo atual: R$" + saldo);
	        return saldo;
	    }
	}



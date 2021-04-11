import java.util.Cliente;


public class Conta extends Cliente{
	private int agencia, numero, tipo;
	private double limite,saldo;
	private Cliente Cliente;
	private Endereco Endereco;

	public Conta(int agencia,int numero,int tipo, double limite, double saldo, Cliente cliente){
		this.agencia = 0;
		this.numero = 0;
		this.tipo = 0;
		this.Cliente = Cliente;
		this.Endereco = Endereco;
		this.limite = 1.3;
		this.saldo = 1.3;
	}

	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public Cliente getCliente() {
		return Cliente;
	}


	public void setCliente(Cliente cliente) {
		this.Cliente = Cliente;
	}


	public Endereco getEndereco() {
		return Endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public void transferir(double valor, Cliente Conta){
		conta.saldo+=valor;
		saldo -= valor;
	}
	public  void sacar(double valor){
		if(saldo >= valor){
			saldo -= valor;
	      }
	      else{
	        System.out.println("Saldo Insuficiente");
	      }
	}
	public void depositar(double deposito) {
			saldo += deposito;
	}
	public String relatorio(){
		
	}

}

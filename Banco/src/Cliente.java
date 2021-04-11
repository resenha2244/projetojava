
	public class Cliente {
	private String nome;
	private int cpf;
	private String conta;
	private String Endereco;
	
	public Cliente(String nome, String conta, String Endereco) {
	 this.conta = conta;
	 this.nome = nome;
	 this.cpf = 0;
	 this.Endereco = Endereco;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public String getConta() {
		return conta;
	}


	public void setConta(String conta) {
		this.conta = conta;
	}


	public String getEndereco() {
		return Endereco;
	}


	public void setEndereco(String Endereco) {
		this.Endereco = Endereco;
	}
	



}

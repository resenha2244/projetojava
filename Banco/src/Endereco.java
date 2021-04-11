import javax.swing.JOptionPane;

public class Endereco {
	private int cep;
	private String rua;
	private String bairro;
	private int numero;
	private String cidade;
	private String estado;
	private String pais;
	
	public Endereco() {
		this.bairro= " ";
		this.cep = 0;
		this.cidade = " ";
		this.estado = " ";
		this.numero = 0;
		this.pais = " ";
		this.rua = " ";
	}
	public Endereco(String rua, String bairro, String cidade, String estado, String pais, int numero, int cep){
		this.bairro=  bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.numero = numero;
		this.pais = pais;
		this.rua = rua;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public void declararEndereco(String rua, String bairro, String cidade,String estado, String pais){
		rua=JOptionPane.showInputDialog( "Digite sua rua");
		bairro=JOptionPane.showInputDialog( "Digite seu bairro");
		cidade=JOptionPane.showInputDialog( "Digite sua cidade");
		pais=JOptionPane.showInputDialog( "Digite seu pais");
		estado=JOptionPane.showInputDialog( "Digite seu estado");
	} 
	
	

}

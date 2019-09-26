
public class Net implements Servico{

	private String nome;
	private double preco;
	private String descricao;
	private String velocidade;
	
	public Net(String nome, String descricao, double preco, String velocidade) {
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
		this.velocidade = velocidade;
	}
	
	
	@Override
	public String nome() {
		// TODO Auto-generated method stub
		return this.nome;
	}

	@Override
	public String descricao() {
		// TODO Auto-generated method stub
		return this.descricao;
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return this.preco;
	}


	@Override
	public String toString() {
		return "Net [nome=" + nome + ", descricao=" + descricao +", preco=" + preco +  "]";
	}
	
}

/** Classe representante de um serviço de Net */
public class Net implements Servico{

	private String nome;
	private double preco;
	private String descricao;
	private String velocidade;
	
	/** Construtor da classe */
	public Net(String nome, String descricao, double preco, String velocidade) {
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
		this.velocidade = velocidade;
	}
	
	
	@Override
	public String nome() {
		
		return this.nome;
	}

	@Override
	public String descricao() {
		
		return this.descricao;
	}

	@Override
	public double price() {
		
		return this.preco;
	}


	@Override
	public String toString() {
		return "Net [nome=" + nome + ", descricao=" + descricao +", preco=" + preco +  "]";
	}
	
}

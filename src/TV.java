/** Classe representante de um serviço de TV */
public class TV implements Servico{

	private String nome;
	private double preco;
	private String descricao;
	private int canais;
	
	/** Construtor da classe */
	public TV(String nome, String descricao, double preco, int canais) {
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
		this.canais = canais;
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
		return "TV [nome=" + nome + ", descricao=" + descricao +", preco=" + preco + "], canais=" + canais;
	}

}

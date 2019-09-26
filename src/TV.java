
public class TV implements Servico{

	private String nome;
	private double preco;
	private String descricao;
	private int canais;
	
	public TV(String nome, String descricao, double preco, int canais) {
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
		this.canais = canais;
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
		return "TV [nome=" + nome + ", descricao=" + descricao +", preco=" + preco + "], canais=" + canais;
	}

}

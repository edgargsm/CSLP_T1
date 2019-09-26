
public class Voz implements Servico{
	
	private String nome;
	private double preco;
	private String descricao;
	
	public Voz(String nome, String descricao, double preco) {
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
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
		return "Voz [nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + "]";
	}

}

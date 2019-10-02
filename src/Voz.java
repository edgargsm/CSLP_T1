/** Classe representante de um serviço de Voz */
public class Voz implements Servico{
	
	private String nome;
	private double preco;
	private String descricao;

	/** Construtor da classe */	
	public Voz(String nome, String descricao, double preco) {
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
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
		return "Voz [nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + "]";
	}

}

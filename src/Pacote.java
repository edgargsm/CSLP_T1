import java.util.ArrayList;

public class Pacote implements Servico{

	private String nome;
	private double preco = 0;
	private String descricao;
	private static StringBuilder sb = new StringBuilder();
	private int periodoFidelizacao;
	private ArrayList<Servico> servicos = new ArrayList<>();
	
	public Pacote(String nome, String descricao, int fidelizacao) {
		this.nome = nome;
		this.preco = preco;
		this.periodoFidelizacao = fidelizacao;
	}
	
	public void add(Servico serv) {
		servicos.add(serv);
		double precoTotal = 0.0;
		for (Servico s:servicos) {
			precoTotal = precoTotal + s.price();
		}
		this.preco = precoTotal*0.75;
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
		String s = "Pacote [nome=" + nome + ", descricao=" + descricao +", preco=" + preco + "] com fidelização de " + this.periodoFidelizacao+" meses";
		sb.append("               ");
		for(Servico serv : this.servicos) {
			s = s +"\n"+sb.toString()+ serv.toString();
		}
		sb.setLength(sb.length()-15);
		return s;
	}
	
}

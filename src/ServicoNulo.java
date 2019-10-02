/** Classe que representa o objeto nulo da interface serviço. */ 
public class ServicoNulo implements Servico{

	@Override
	public String nome() {
		
		return "";
	}

	@Override
	public String descricao() {
		
		return "";
	}

	@Override
	public double price() {
		
		return 0;
	}

	@Override
	public String toString() {
		return "ServicoVazio [nome=nao existe, descricao=nao existe, preco=0.0]";
	}
	
}

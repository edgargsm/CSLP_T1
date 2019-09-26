
public class ServicoNulo implements Servico{

	@Override
	public String nome() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String descricao() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "ServicoVazio [nome=nao existe, descricao=nao existe, preco=0.0]";
	}
	
}

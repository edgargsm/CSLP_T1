/**
*
*Interface que define os métodos presentes nas classes que são serviços.
*
*
*/
public interface Servico {
	/** Devolve o nome do serviço */
	public String nome();

	/** Devolve a descrição do serviço */
	public String descricao();

	/** Devolve o preço do serviço */
	public double price();
}

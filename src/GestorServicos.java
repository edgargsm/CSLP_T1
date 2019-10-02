/**
* Interface de um gestor de serviços que vai ser responsável por operações relacionadas com a manutenção de
* um conjunto/registo de serviços.
*/
public interface GestorServicos extends Iterable<String> {
	
	/** Adiciona um serviço aos registados  */
	public boolean registaServico(String key, Servico servico);

	/** Verifica se este serviço se encontra entre os registados */
	public boolean existeServico(String key); 

	/** Remove um serviço aos registados */
	public Servico eliminaServico(String key); 

	/** Devolve/Seleciona o serviço requerido */
	public Servico getServico(String key); 

	/** Seleciona o registo utilizado */
	public void setRegister(OperationRegister or); 

	/** Verifica se o serviço esta a utilizar um registo de momento */
	public boolean hasRegister(); 
}

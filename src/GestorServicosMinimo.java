import java.util.Iterator;

public class GestorServicosMinimo implements GestorServicos{

	private GestorServicos gss;
	
	public GestorServicosMinimo(GestorServicos gest1) {
		this.gss = gest1;
	}
	
	public GestorServicosMinimo() {
		this.gss = new GestorServicosStandard();
	}

	@Override
	public Iterator<String> iterator() {
		return gss.iterator();
	}

	@Override
	public boolean registaServico(String key, Servico servico) {
		if(gss.existeServico(key)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean existeServico(String key) {
		return gss.existeServico(key);
	}

	@Override
	public Servico eliminaServico(String key) {
		return new ServicoNulo();
	}

	@Override
	public Servico getServico(String key) {
		return gss.getServico(key);
	}

	@Override
	public void setRegister(OperationRegister or) {
		gss.setRegister(or);
		
	}

	@Override
	public boolean hasRegister() {
		return gss.hasRegister();
	}
	
	
	
}

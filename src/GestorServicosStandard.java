import java.security.Provider.Service;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;



public class GestorServicosStandard implements GestorServicos {
	
	Map<String, Servico> map = new TreeMap<>();
	OperationRegister opReg = null;
	
	public void setRegister(OperationRegister or) {
		this.opReg = or;
	};
	
	public boolean hasRegister() {
		return (opReg!=null);
	};
	
	@Override
	public Iterator<String> iterator() /** Devolve um iterador para esta classe */{
		return (this).new GestorIterator();
	}

	@Override
	public boolean registaServico(String key, Servico servico) {
		boolean b = map.containsKey(key);
		map.put(key, servico);
		if(b && this.hasRegister())
			opReg.register(key, servico, Operacao.ALTERACAO);
		else if(!b && this.hasRegister())
			opReg.register(key, servico, Operacao.REGISTO);
		return b;
	}

	@Override
	public boolean existeServico(String key) {
		if(map.containsKey(key)) {
			return true;
		}
		return false;
	}

	@Override
	public Servico eliminaServico(String key) {
		if(map.containsKey(key)) {
			if(this.hasRegister())
				opReg.register(key, map.get(key), Operacao.ELIMINACAO);
			return map.remove(key);
		}
		return null;
	}

	@Override
	public Servico getServico(String key) {
		if(map.containsKey(key)) {
			return map.get(key);
		}
		return null;
	}
	
	private class GestorIterator implements Iterator<String> /** Implementa uma classe iterador para esta classe */{
		
		private int index=0;
		
		private Iterator<String> keys = GestorServicosStandard.this.map.keySet().iterator();
		
		@Override
		public boolean hasNext() {
			return keys.hasNext();
		}

		@Override
		public String next() {
			if(this.hasNext()) {
				String key = keys.next();
				return "Ref: "+ key + " - " + GestorServicosStandard.this.map.get(key);
			}
			throw new NoSuchElementException("only " + GestorServicosStandard.this.map.size() + " elements");
		}
		
	}


}

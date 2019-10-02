import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Classe representante de um registo de operacoes */
public class OperationRegister {
	
	private ArrayList<String> register = new ArrayList<>();
	
	/** Adiciona informacao/operacoes ao registo */
	public void register(String key, Servico s, Operacao op) {
		String reg = "";
		reg = reg + "- Operação :" + op;
		reg = reg + "; Ref: " + key;
		reg = reg + "; Serviço : "+ s.toString();
		register.add(reg);
	}
	
	/** Retorna uma lista (nao pode ser modificada) das operacoes do registo */
	public List<String> getRegisters() {
		return Collections.unmodifiableList(register);
	}
}

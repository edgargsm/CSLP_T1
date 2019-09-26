import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OperationRegister {
	
	private ArrayList<String> register = new ArrayList<>();
	
	public void register(String key, Servico s, Operacao op) {
		String reg = "";
		reg = reg + "- Operação :" + op;
		reg = reg + "; Ref: " + key;
		reg = reg + "; Serviço : "+ s.toString();
		register.add(reg);
	}
	
	public List<String> getRegisters() {
		return Collections.unmodifiableList(register);
	}
}

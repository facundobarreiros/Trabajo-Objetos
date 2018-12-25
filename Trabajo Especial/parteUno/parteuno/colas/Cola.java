package parteuno.colas;

import java.util.ArrayList;
import java.util.List;

public class Cola extends ColaAbst {
	
	private	List<Object> terminal = new ArrayList<Object>();
	
	public void agregar(Object obj){
		
		terminal.add(obj);
		
	}
	
	public Object devolver(){
			
		return terminal.get(0);

	}

	//@Override
	public int getTamano() {
		return terminal.size();
	}
	
		
	public List<Cola> getTerminals() {
		
		List<Cola> res=new ArrayList<Cola>();
		
		res.add(this);
		
		return res;
	}
	
	
}

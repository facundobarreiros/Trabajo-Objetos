package cola;

import java.util.List;

public abstract class ColaAbst implements Comparable<ColaAbst>{
		
	public abstract Object devolver();

	public abstract void agregar(Object obj);
	
	protected abstract int getTamano() ;
		
	public abstract List<Cola> getTerminals();
	
	@Override
	public int compareTo(ColaAbst o) {
		
		  int resultado=0;

	        if ( this.getTamano()<o.getTamano()) {   resultado = -1;      }

	        else 
	        	
	        	if (this.getTamano()>o.getTamano()) {    resultado = 1;      }

	      
	            else {   resultado = 0;   }

	        
	        return resultado; }
	
}
	
	
	

package parteuno.colas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract  class ColaMult extends ColaAbst{
	
   protected List<ColaAbst> cola1 = new ArrayList<ColaAbst>();
		
   public void agregar(ColaAbst cola) {
		
	   cola1.add(cola);
	   
	};
	
	//agrega en una de las colas dadas
	protected void agregar(int x,Object obj) {

		 (cola1.get(x)).agregar(obj);
	
	}
	
	//devuleve un elemento en una posicion dada
	protected Object devolver(int x){
		
		return cola1.get(x).devolver();
	
	}
	
	@Override //devuelve la cantidad de elementos de la estuctura
	public int getTamano() {
		
		int acumulador=0;
		
		for(ColaAbst c:cola1)
			 
			 acumulador=acumulador+(c.getTamano());
		 
		return acumulador;
			
	}
	
	public List<Cola> getTerminals() {
		
		List<Cola> res = new ArrayList<Cola>();
		
		for (ColaAbst c : cola1) {
			
			res.addAll(c.getTerminals());
		}
		return res;
	}
	
	
	//Cola con mas elementos 
		public Cola getColaMaxima() {
			
			List<Cola> lista=getTerminals();
			
			ColaAbst solucion = Collections.max(lista);
			
			return ((Cola)solucion);
		}

		//devolver contidad de colas terminales
		public int getCantColas() {
			
			return getTerminals().size();
			
		}

}
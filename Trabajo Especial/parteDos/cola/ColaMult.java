package cola;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import criterios.Criterio;


public class ColaMult extends ColaAbst{
	
   protected List<ColaAbst> cola1 = new ArrayList<ColaAbst>();
		
 	protected Criterio criterio;
	
	
	public ColaMult(Criterio criterio) {
	
		this.criterio=criterio;		
				
	}
	
	public void  setCriterio(Criterio criterio) {
		
		this.criterio=criterio;	

	}	
	
//	@Override
    public void agregar(ColaAbst cola) {
	   
		cola1.add(cola);
			
	};
	
	
//	@Override
	public void agregar(Object obj) {
		
		int aux=cola1.size();
		
		int pos=criterio.getCola(aux);
			
	    (cola1.get(pos)).agregar(obj);
	}
	
	
	@Override
	public Object devolver() {
		
		int aux=cola1.size();
		
		int pos=criterio.getCola(aux);
				
		return cola1.get(pos).devolver();
	}
	
	@Override 	//cant de elemento que contiene una estructura
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
		
		Cola solucion = Collections.max(lista);
		
		return ((Cola)solucion);
	}
	

	
	//devolver contidad de colas terminales
	public int getCantColas() {
		
		return getTerminals().size();
		
	}

}

		
	

